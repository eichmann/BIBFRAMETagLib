package edu.uiowa.slis.BIBFRAME.LcOverseasAcqNumber;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LcOverseasAcqNumberLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static LcOverseasAcqNumberLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(LcOverseasAcqNumberLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			LcOverseasAcqNumber theLcOverseasAcqNumber = (LcOverseasAcqNumber)findAncestorWithClass(this, LcOverseasAcqNumber.class);
			if (!theLcOverseasAcqNumber.commitNeeded) {
				pageContext.getOut().print(theLcOverseasAcqNumber.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing LcOverseasAcqNumber for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing LcOverseasAcqNumber for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			LcOverseasAcqNumber theLcOverseasAcqNumber = (LcOverseasAcqNumber)findAncestorWithClass(this, LcOverseasAcqNumber.class);
			return theLcOverseasAcqNumber.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing LcOverseasAcqNumber for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing LcOverseasAcqNumber for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			LcOverseasAcqNumber theLcOverseasAcqNumber = (LcOverseasAcqNumber)findAncestorWithClass(this, LcOverseasAcqNumber.class);
			theLcOverseasAcqNumber.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing LcOverseasAcqNumber for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing LcOverseasAcqNumber for label tag ");
		}
	}
}

