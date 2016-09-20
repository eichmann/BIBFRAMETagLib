package edu.uiowa.slis.BIBFRAME.UdcShelfMark;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UdcShelfMarkHasGenreInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static UdcShelfMarkHasGenreInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(UdcShelfMarkHasGenreInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UdcShelfMarkHasGenreInverseIterator theUdcShelfMarkHasGenreInverseIterator = (UdcShelfMarkHasGenreInverseIterator)findAncestorWithClass(this, UdcShelfMarkHasGenreInverseIterator.class);
			pageContext.getOut().print(theUdcShelfMarkHasGenreInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing UdcShelfMark for hasGenre tag ", e);
			throw new JspTagException("Error: Can't find enclosing UdcShelfMark for hasGenre tag ");
		}
		return SKIP_BODY;
	}
}

