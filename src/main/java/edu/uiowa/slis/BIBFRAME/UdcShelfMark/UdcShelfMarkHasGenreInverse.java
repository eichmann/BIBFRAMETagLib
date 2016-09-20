package edu.uiowa.slis.BIBFRAME.UdcShelfMark;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UdcShelfMarkHasGenreInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static UdcShelfMarkHasGenreInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(UdcShelfMarkHasGenreInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UdcShelfMarkHasGenreInverseIterator theUdcShelfMarkHasGenreInverseIterator = (UdcShelfMarkHasGenreInverseIterator)findAncestorWithClass(this, UdcShelfMarkHasGenreInverseIterator.class);
			pageContext.getOut().print(theUdcShelfMarkHasGenreInverseIterator.getHasGenreInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing UdcShelfMark for hasGenre tag ", e);
			throw new JspTagException("Error: Can't find enclosing UdcShelfMark for hasGenre tag ");
		}
		return SKIP_BODY;
	}
}

