package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Serial extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static Serial currentInstance = null;
	private static final Log log = LogFactory.getLog(Serial.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			SerialIterator theSerialIterator = (SerialIterator) findAncestorWithClass(this, SerialIterator.class);

			if (theSerialIterator != null) {
				subjectURI = theSerialIterator.getSubjectURI();
				label = theSerialIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkIsLastOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkIsLastOfIterator)this.getParent()).getIsLastOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkIsFirstOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkIsFirstOfIterator)this.getParent()).getIsFirstOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Annotation.AnnotationHasTargetIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Annotation.AnnotationHasTargetIterator)this.getParent()).getHasTarget();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkIsLastOfIterator theWorkIsLastOfIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkIsLastOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkIsLastOfIterator.class);

			if (subjectURI == null && theWorkIsLastOfIterator != null) {
				subjectURI = theWorkIsLastOfIterator.getIsLastOf();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkIsFirstOfIterator theWorkIsFirstOfIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkIsFirstOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkIsFirstOfIterator.class);

			if (subjectURI == null && theWorkIsFirstOfIterator != null) {
				subjectURI = theWorkIsFirstOfIterator.getIsFirstOf();
			}

			edu.uiowa.slis.BIBFRAME.Annotation.AnnotationHasTargetIterator theAnnotationHasTargetIterator = (edu.uiowa.slis.BIBFRAME.Annotation.AnnotationHasTargetIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Annotation.AnnotationHasTargetIterator.class);

			if (subjectURI == null && theAnnotationHasTargetIterator != null) {
				subjectURI = theAnnotationHasTargetIterator.getHasTarget();
			}

			if (theSerialIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(Prefix_1_4
				+ " SELECT ?label  where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in Serial doStartTag", e);
			throw new JspTagException("Exception raised in Serial doStartTag");
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
			log.error("Exception raised in Serial doEndTag", e);
			throw new JspTagException("Exception raised in Serial doEndTag");
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
