package edu.uiowa.slis.BIBFRAME.AwardReceipt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AwardReceiptSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AwardReceiptSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(AwardReceiptSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			AwardReceipt theAwardReceipt = (AwardReceipt)findAncestorWithClass(this, AwardReceipt.class);
			if (!theAwardReceipt.commitNeeded) {
				pageContext.getOut().print(theAwardReceipt.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing AwardReceipt for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing AwardReceipt for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			AwardReceipt theAwardReceipt = (AwardReceipt)findAncestorWithClass(this, AwardReceipt.class);
			return theAwardReceipt.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing AwardReceipt for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing AwardReceipt for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			AwardReceipt theAwardReceipt = (AwardReceipt)findAncestorWithClass(this, AwardReceipt.class);
			theAwardReceipt.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing AwardReceipt for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing AwardReceipt for subjectURI tag ");
		}
	}
}

