package edu.uiowa.slis.BIBFRAME.PostalRegistrationNumber;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class PostalRegistrationNumber extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PostalRegistrationNumber currentInstance = null;
	private static final Log log = LogFactory.getLog(PostalRegistrationNumber.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			PostalRegistrationNumberIterator thePostalRegistrationNumberIterator = (PostalRegistrationNumberIterator) findAncestorWithClass(this, PostalRegistrationNumberIterator.class);

			if (thePostalRegistrationNumberIterator != null) {
				subjectURI = thePostalRegistrationNumberIterator.getSubjectURI();
				label = thePostalRegistrationNumberIterator.getLabel();
			}

			if (thePostalRegistrationNumberIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?label  where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in PostalRegistrationNumber doStartTag", e);
			throw new JspTagException("Exception raised in PostalRegistrationNumber doStartTag");
		} finally {
			freeConnection();
		}

		return EVAL_PAGE;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in PostalRegistrationNumber doEndTag", e);
			throw new JspTagException("Exception raised in PostalRegistrationNumber doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
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
