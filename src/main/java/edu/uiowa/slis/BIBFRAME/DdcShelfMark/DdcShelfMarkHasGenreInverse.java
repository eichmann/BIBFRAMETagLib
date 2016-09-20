package edu.uiowa.slis.BIBFRAME.DdcShelfMark;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DdcShelfMarkHasGenreInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DdcShelfMarkHasGenreInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(DdcShelfMarkHasGenreInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DdcShelfMarkHasGenreInverseIterator theDdcShelfMarkHasGenreInverseIterator = (DdcShelfMarkHasGenreInverseIterator)findAncestorWithClass(this, DdcShelfMarkHasGenreInverseIterator.class);
			pageContext.getOut().print(theDdcShelfMarkHasGenreInverseIterator.getHasGenreInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing DdcShelfMark for hasGenre tag ", e);
			throw new JspTagException("Error: Can't find enclosing DdcShelfMark for hasGenre tag ");
		}
		return SKIP_BODY;
	}
}

