package edu.uiowa.slis.BIBFRAME.LccShelfMark;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LccShelfMarkHasGenreInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static LccShelfMarkHasGenreInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(LccShelfMarkHasGenreInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LccShelfMarkHasGenreInverseIterator theLccShelfMarkHasGenreInverseIterator = (LccShelfMarkHasGenreInverseIterator)findAncestorWithClass(this, LccShelfMarkHasGenreInverseIterator.class);
			pageContext.getOut().print(theLccShelfMarkHasGenreInverseIterator.getHasGenreInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing LccShelfMark for hasGenre tag ", e);
			throw new JspTagException("Error: Can't find enclosing LccShelfMark for hasGenre tag ");
		}
		return SKIP_BODY;
	}
}

