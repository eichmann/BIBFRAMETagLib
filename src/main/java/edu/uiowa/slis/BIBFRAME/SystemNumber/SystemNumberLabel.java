package edu.uiowa.slis.BIBFRAME.SystemNumber;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SystemNumberLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SystemNumberLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(SystemNumberLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			SystemNumber theSystemNumber = (SystemNumber)findAncestorWithClass(this, SystemNumber.class);
			if (!theSystemNumber.commitNeeded) {
				pageContext.getOut().print(theSystemNumber.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing SystemNumber for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing SystemNumber for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			SystemNumber theSystemNumber = (SystemNumber)findAncestorWithClass(this, SystemNumber.class);
			return theSystemNumber.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing SystemNumber for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing SystemNumber for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			SystemNumber theSystemNumber = (SystemNumber)findAncestorWithClass(this, SystemNumber.class);
			theSystemNumber.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing SystemNumber for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing SystemNumber for label tag ");
		}
	}
}

