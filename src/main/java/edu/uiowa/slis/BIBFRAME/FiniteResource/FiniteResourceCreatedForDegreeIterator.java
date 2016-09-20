package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

import java.util.Hashtable;

@SuppressWarnings("serial")
public class FiniteResourceCreatedForDegreeIterator extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceCreatedForDegreeIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceCreatedForDegreeIterator.class);

	String subjectURI = null;
	String type = null;
	String createdForDegree = null;
	ResultSet rs = null;
	Hashtable<String,String> classFilter = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			FiniteResource theFiniteResource = (FiniteResource) findAncestorWithClass(this, FiniteResource.class);

			if (theFiniteResource != null) {
				subjectURI = theFiniteResource.getSubjectURI();
			}

			if (theFiniteResource == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s ?t where {"
					+" <" + subjectURI + "> <http://bib.ld4l.org/ontology/createdForDegree> ?s . "
					+" ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?t ."
					+" FILTER NOT EXISTS {"
					+"   ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?subtype ."
					+"   ?subtype <http://www.w3.org/2000/01/rdf-schema#subClassOf> ?t ."
					+"   filter ( ?subtype != ?t )"
					+" }"
					+"} ");
			while(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				createdForDegree = sol.get("?s").toString();
				type = getLocalName(sol.get("?t").toString());
				if (classFilter == null || (classFilter != null && type != null && classFilter.containsKey(type))) {
					log.info("instance: " + createdForDegree + "	type: " + type);
					return EVAL_BODY_INCLUDE;
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in FiniteResourceCreatedForDegreeIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in FiniteResourceCreatedForDegreeIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			while(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				createdForDegree = sol.get("?s").toString();
				type = getLocalName(sol.get("?t").toString());
				if (classFilter == null || (classFilter != null && type != null && classFilter.containsKey(type))) {
					log.info("instance: " + createdForDegree + "	type: " + type);
					return EVAL_BODY_AGAIN;
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in FiniteResourceCreatedForDegreeIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in FiniteResourceCreatedForDegreeIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in FiniteResourceCreatedForDegree doEndTag", e);
			throw new JspTagException("Exception raised in FiniteResourceCreatedForDegree doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
		type = null;
		createdForDegree = null;
		classFilter = null;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setCreatedForDegree(String createdForDegree) {
		this.createdForDegree = createdForDegree;
	}

	public String getCreatedForDegree() {
		return createdForDegree;
	}

	public void setClassFilter(String filterString) {
		String[] classFilterArray = filterString.split(" ");
		this.classFilter = new Hashtable<String, String>();
		for (String filterClass : classFilterArray) {
			log.info("adding filterClass " + filterClass + " to FiniteResourceCreatedForDegreeIterator");
			classFilter.put(filterClass, "");
		}
	}

	public String getClassFilter() {
		return classFilter.toString();
	}

}
