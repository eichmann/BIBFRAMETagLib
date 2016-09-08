package edu.uiowa.slis.BIBFRAME.UdcShelfMark;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UdcShelfMarkLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static UdcShelfMarkLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(UdcShelfMarkLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			UdcShelfMark theUdcShelfMark = (UdcShelfMark)findAncestorWithClass(this, UdcShelfMark.class);
			if (!theUdcShelfMark.commitNeeded) {
				pageContext.getOut().print(theUdcShelfMark.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing UdcShelfMark for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing UdcShelfMark for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			UdcShelfMark theUdcShelfMark = (UdcShelfMark)findAncestorWithClass(this, UdcShelfMark.class);
			return theUdcShelfMark.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing UdcShelfMark for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing UdcShelfMark for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			UdcShelfMark theUdcShelfMark = (UdcShelfMark)findAncestorWithClass(this, UdcShelfMark.class);
			theUdcShelfMark.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing UdcShelfMark for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing UdcShelfMark for label tag ");
		}
	}
}

