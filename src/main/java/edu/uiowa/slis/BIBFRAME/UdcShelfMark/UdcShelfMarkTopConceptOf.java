package edu.uiowa.slis.BIBFRAME.UdcShelfMark;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UdcShelfMarkTopConceptOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static UdcShelfMarkTopConceptOf currentInstance = null;
	private static final Log log = LogFactory.getLog(UdcShelfMarkTopConceptOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UdcShelfMarkTopConceptOfIterator theUdcShelfMarkTopConceptOfIterator = (UdcShelfMarkTopConceptOfIterator)findAncestorWithClass(this, UdcShelfMarkTopConceptOfIterator.class);
			pageContext.getOut().print(theUdcShelfMarkTopConceptOfIterator.getTopConceptOf());
		} catch (Exception e) {
			log.error("Can't find enclosing UdcShelfMark for topConceptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing UdcShelfMark for topConceptOf tag ");
		}
		return SKIP_BODY;
	}
}

