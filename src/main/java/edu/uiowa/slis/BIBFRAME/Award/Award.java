package edu.uiowa.slis.BIBFRAME.Award;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Award extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static Award currentInstance = null;
	private static final Log log = LogFactory.getLog(Award.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			AwardIterator theAwardIterator = (AwardIterator) findAncestorWithClass(this, AwardIterator.class);

			if (theAwardIterator != null) {
				subjectURI = theAwardIterator.getSubjectURI();
				label = theAwardIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.AwardReceipt.AwardReceiptIsReceiptOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.AwardReceipt.AwardReceiptIsReceiptOfIterator)this.getParent()).getIsReceiptOf();
			}

			edu.uiowa.slis.BIBFRAME.AwardReceipt.AwardReceiptIsReceiptOfIterator theAwardReceiptIsReceiptOfIterator = (edu.uiowa.slis.BIBFRAME.AwardReceipt.AwardReceiptIsReceiptOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.AwardReceipt.AwardReceiptIsReceiptOfIterator.class);

			if (subjectURI == null && theAwardReceiptIsReceiptOfIterator != null) {
				subjectURI = theAwardReceiptIsReceiptOfIterator.getIsReceiptOf();
			}

			if (theAwardIterator == null && subjectURI == null) {
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
			log.error("Exception raised in Award doStartTag", e);
			throw new JspTagException("Exception raised in Award doStartTag");
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
			log.error("Exception raised in Award doEndTag", e);
			throw new JspTagException("Exception raised in Award doEndTag");
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
