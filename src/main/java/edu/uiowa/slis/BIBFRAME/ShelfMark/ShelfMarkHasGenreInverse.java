package edu.uiowa.slis.BIBFRAME.ShelfMark;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ShelfMarkHasGenreInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ShelfMarkHasGenreInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ShelfMarkHasGenreInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ShelfMarkHasGenreInverseIterator theShelfMarkHasGenreInverseIterator = (ShelfMarkHasGenreInverseIterator)findAncestorWithClass(this, ShelfMarkHasGenreInverseIterator.class);
			pageContext.getOut().print(theShelfMarkHasGenreInverseIterator.getHasGenreInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing ShelfMark for hasGenre tag ", e);
			throw new JspTagException("Error: Can't find enclosing ShelfMark for hasGenre tag ");
		}
		return SKIP_BODY;
	}
}

