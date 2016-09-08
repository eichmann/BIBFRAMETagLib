package edu.uiowa.slis.BIBFRAME.LegalDepositNumber;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDepositNumberSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static LegalDepositNumberSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDepositNumberSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			LegalDepositNumber theLegalDepositNumber = (LegalDepositNumber)findAncestorWithClass(this, LegalDepositNumber.class);
			if (!theLegalDepositNumber.commitNeeded) {
				pageContext.getOut().print(theLegalDepositNumber.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDepositNumber for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDepositNumber for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			LegalDepositNumber theLegalDepositNumber = (LegalDepositNumber)findAncestorWithClass(this, LegalDepositNumber.class);
			return theLegalDepositNumber.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing LegalDepositNumber for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDepositNumber for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			LegalDepositNumber theLegalDepositNumber = (LegalDepositNumber)findAncestorWithClass(this, LegalDepositNumber.class);
			theLegalDepositNumber.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDepositNumber for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDepositNumber for subjectURI tag ");
		}
	}
}

