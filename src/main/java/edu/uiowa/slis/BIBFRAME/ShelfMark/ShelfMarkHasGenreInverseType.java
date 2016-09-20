package edu.uiowa.slis.BIBFRAME.ShelfMark;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ShelfMarkHasGenreInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ShelfMarkHasGenreInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ShelfMarkHasGenreInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ShelfMarkHasGenreInverseIterator theShelfMarkHasGenreInverseIterator = (ShelfMarkHasGenreInverseIterator)findAncestorWithClass(this, ShelfMarkHasGenreInverseIterator.class);
			pageContext.getOut().print(theShelfMarkHasGenreInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ShelfMark for hasGenre tag ", e);
			throw new JspTagException("Error: Can't find enclosing ShelfMark for hasGenre tag ");
		}
		return SKIP_BODY;
	}
}

