package edu.uiowa.slis.BIBFRAME.UdcShelfMark;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UdcShelfMarkTopConceptOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static UdcShelfMarkTopConceptOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(UdcShelfMarkTopConceptOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UdcShelfMarkTopConceptOfIterator theUdcShelfMarkTopConceptOfIterator = (UdcShelfMarkTopConceptOfIterator)findAncestorWithClass(this, UdcShelfMarkTopConceptOfIterator.class);
			pageContext.getOut().print(theUdcShelfMarkTopConceptOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing UdcShelfMark for topConceptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing UdcShelfMark for topConceptOf tag ");
		}
		return SKIP_BODY;
	}
}

