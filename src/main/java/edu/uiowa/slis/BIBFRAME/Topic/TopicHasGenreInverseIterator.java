package edu.uiowa.slis.BIBFRAME.Topic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

import java.util.Hashtable;

@SuppressWarnings("serial")
public class TopicHasGenreInverseIterator extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TopicHasGenreInverseIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(TopicHasGenreInverseIterator.class);

	String subjectURI = null;
	String type = null;
	String hasGenreInverse = null;
	ResultSet rs = null;
	Hashtable<String,String> classFilter = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			Topic theTopic = (Topic) findAncestorWithClass(this, Topic.class);

			if (theTopic != null) {
				subjectURI = theTopic.getSubjectURI();
			}

			if (theTopic == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s ?t where {"
					+" ?s <http://bib.ld4l.org/ontology/hasGenre> <" + subjectURI+ "> . "
					+" ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?t ."
					+" FILTER NOT EXISTS {"
					+"   ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?subtype ."
					+"   ?subtype <http://www.w3.org/2000/01/rdf-schema#subClassOf> ?t ."
					+"   filter ( ?subtype != ?t )"
					+" }"
					+"} ");
			while(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				hasGenreInverse = sol.get("?s").toString();
				type = getLocalName(sol.get("?t").toString());
				if (classFilter == null || (classFilter != null && classFilter.containsKey(type))) {
					log.info("instance: " + hasGenreInverse + "	type: " + type);
					return EVAL_BODY_INCLUDE;
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in TopicHasGenreInverseIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in TopicHasGenreInverseIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			while(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				hasGenreInverse = sol.get("?s").toString();
				type = getLocalName(sol.get("?t").toString());
				if (classFilter == null || (classFilter != null && classFilter.containsKey(type))) {
					log.info("instance: " + hasGenreInverse + "	type: " + type);
					return EVAL_BODY_AGAIN;
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in TopicHasGenreIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in TopicHasGenreIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in TopicHasGenre doEndTag", e);
			throw new JspTagException("Exception raised in TopicHasGenre doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
		type = null;
		hasGenreInverse = null;
		classFilter = null;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setHasGenreInverse(String hasGenreInverse) {
		this.hasGenreInverse = hasGenreInverse;
	}

	public String getHasGenreInverse() {
		return hasGenreInverse;
	}

	public void setClassFilter(String filterString) {
		String[] classFilterArray = filterString.split(" ");
		this.classFilter = new Hashtable<String, String>();
		for (String filterClass : classFilterArray) {
			log.info("adding filterClass " + filterClass + " to TopicHasGenreIterator");
			classFilter.put(filterClass, "");
		}
	}

	public String getClassFilter() {
		return classFilter.toString();
	}

}
