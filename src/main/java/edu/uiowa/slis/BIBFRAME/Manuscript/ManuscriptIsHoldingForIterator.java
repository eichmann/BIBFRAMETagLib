package edu.uiowa.slis.BIBFRAME.Manuscript;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

import java.util.Hashtable;

@SuppressWarnings("serial")
public class ManuscriptIsHoldingForIterator extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ManuscriptIsHoldingForIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(ManuscriptIsHoldingForIterator.class);

	String subjectURI = null;
	String type = null;
	String isHoldingFor = null;
	ResultSet rs = null;
	Hashtable<String,String> classFilter = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			Manuscript theManuscript = (Manuscript) findAncestorWithClass(this, Manuscript.class);

			if (theManuscript != null) {
				subjectURI = theManuscript.getSubjectURI();
			}

			if (theManuscript == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s ?t where {"
					+" <" + subjectURI + "> <http://bib.ld4l.org/ontology/isHoldingFor> ?s . "
					+" ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?t ."
					+" FILTER NOT EXISTS {"
					+"   ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?subtype ."
					+"   ?subtype <http://www.w3.org/2000/01/rdf-schema#subClassOf> ?t ."
					+"   filter ( ?subtype != ?t )"
					+" }"
					+"} ");
			while(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				isHoldingFor = sol.get("?s").toString();
				type = getLocalName(sol.get("?t").toString());
				if (classFilter == null || (classFilter != null && classFilter.containsKey(type))) {
					log.info("instance: " + isHoldingFor + "	type: " + type);
					return EVAL_BODY_INCLUDE;
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in ManuscriptIsHoldingForIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in ManuscriptIsHoldingForIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			while(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				isHoldingFor = sol.get("?s").toString();
				type = getLocalName(sol.get("?t").toString());
				if (classFilter == null || (classFilter != null && classFilter.containsKey(type))) {
					log.info("instance: " + isHoldingFor + "	type: " + type);
					return EVAL_BODY_AGAIN;
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in ManuscriptIsHoldingForIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in ManuscriptIsHoldingForIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in ManuscriptIsHoldingFor doEndTag", e);
			throw new JspTagException("Exception raised in ManuscriptIsHoldingFor doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
		type = null;
		isHoldingFor = null;
		classFilter = null;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setIsHoldingFor(String isHoldingFor) {
		this.isHoldingFor = isHoldingFor;
	}

	public String getIsHoldingFor() {
		return isHoldingFor;
	}

	public void setClassFilter(String filterString) {
		String[] classFilterArray = filterString.split(" ");
		this.classFilter = new Hashtable<String, String>();
		for (String filterClass : classFilterArray) {
			log.info("adding filterClass " + filterClass + " to ManuscriptIsHoldingForIterator");
			classFilter.put(filterClass, "");
		}
	}

	public String getClassFilter() {
		return classFilter.toString();
	}

}
