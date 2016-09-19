package edu.uiowa.slis.BIBFRAME.Motivation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Motivation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static Motivation currentInstance = null;
	private static final Log log = LogFactory.getLog(Motivation.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			MotivationIterator theMotivationIterator = (MotivationIterator) findAncestorWithClass(this, MotivationIterator.class);

			if (theMotivationIterator != null) {
				subjectURI = theMotivationIterator.getSubjectURI();
				label = theMotivationIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Annotation.AnnotationMotivatedByIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Annotation.AnnotationMotivatedByIterator)this.getParent()).getMotivatedBy();
			}

			edu.uiowa.slis.BIBFRAME.Annotation.AnnotationMotivatedByIterator theAnnotationMotivatedByIterator = (edu.uiowa.slis.BIBFRAME.Annotation.AnnotationMotivatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Annotation.AnnotationMotivatedByIterator.class);

			if (subjectURI == null && theAnnotationMotivatedByIterator != null) {
				subjectURI = theAnnotationMotivatedByIterator.getMotivatedBy();
			}

			if (theMotivationIterator == null && subjectURI == null) {
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
			log.error("Exception raised in Motivation doStartTag", e);
			throw new JspTagException("Exception raised in Motivation doStartTag");
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
			log.error("Exception raised in Motivation doEndTag", e);
			throw new JspTagException("Exception raised in Motivation doEndTag");
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
