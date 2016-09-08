package edu.uiowa.slis.BIBFRAME.UdcShelfMark;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UdcShelfMarkIsClassificationFor extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static UdcShelfMarkIsClassificationFor currentInstance = null;
	private static final Log log = LogFactory.getLog(UdcShelfMarkIsClassificationFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UdcShelfMarkIsClassificationForIterator theUdcShelfMarkIsClassificationForIterator = (UdcShelfMarkIsClassificationForIterator)findAncestorWithClass(this, UdcShelfMarkIsClassificationForIterator.class);
			pageContext.getOut().print(theUdcShelfMarkIsClassificationForIterator.getIsClassificationFor());
		} catch (Exception e) {
			log.error("Can't find enclosing UdcShelfMark for isClassificationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing UdcShelfMark for isClassificationFor tag ");
		}
		return SKIP_BODY;
	}
}

