package edu.uiowa.slis.BIBFRAME.Ean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class EanIterator extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static EanIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(EanIterator.class);

	String subjectURI = null;
	String label = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			rs = getResultSet(prefix+
					" SELECT ?s ?l where { "+
						"?s rdf:type <http://bib.ld4l.org/ontology/Ean> . "+
					"  OPTIONAL { ?s rdfs:label ?l } "+
					"} LIMIT 1000");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				subjectURI = sol.get("?s").toString();
				label = sol.get("?l") == null ? null : sol.get("?l").toString();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in EanIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in EanIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				subjectURI = sol.get("?s").toString();
				label = sol.get("?l") == null ? null : sol.get("?l").toString();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in EanIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in EanIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in Ean doEndTag", e);
			throw new JspTagException("Exception raised in Ean doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
		label = null;
	}

	public void setSubjectURI(String subjectURI) {
		this.subjectURI = subjectURI;
	}

	public String getSubjectURI() {
		return subjectURI;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

}