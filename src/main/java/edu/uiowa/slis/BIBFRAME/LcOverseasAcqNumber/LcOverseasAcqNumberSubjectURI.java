package edu.uiowa.slis.BIBFRAME.LcOverseasAcqNumber;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LcOverseasAcqNumberSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static LcOverseasAcqNumberSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(LcOverseasAcqNumberSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			LcOverseasAcqNumber theLcOverseasAcqNumber = (LcOverseasAcqNumber)findAncestorWithClass(this, LcOverseasAcqNumber.class);
			if (!theLcOverseasAcqNumber.commitNeeded) {
				pageContext.getOut().print(theLcOverseasAcqNumber.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing LcOverseasAcqNumber for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing LcOverseasAcqNumber for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			LcOverseasAcqNumber theLcOverseasAcqNumber = (LcOverseasAcqNumber)findAncestorWithClass(this, LcOverseasAcqNumber.class);
			return theLcOverseasAcqNumber.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing LcOverseasAcqNumber for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing LcOverseasAcqNumber for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			LcOverseasAcqNumber theLcOverseasAcqNumber = (LcOverseasAcqNumber)findAncestorWithClass(this, LcOverseasAcqNumber.class);
			theLcOverseasAcqNumber.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing LcOverseasAcqNumber for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing LcOverseasAcqNumber for subjectURI tag ");
		}
	}
}

