package edu.uiowa.slis.BIBFRAME.LccShelfMark;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LccShelfMarkHasGenreInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static LccShelfMarkHasGenreInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(LccShelfMarkHasGenreInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LccShelfMarkHasGenreInverseIterator theLccShelfMarkHasGenreInverseIterator = (LccShelfMarkHasGenreInverseIterator)findAncestorWithClass(this, LccShelfMarkHasGenreInverseIterator.class);
			pageContext.getOut().print(theLccShelfMarkHasGenreInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LccShelfMark for hasGenre tag ", e);
			throw new JspTagException("Error: Can't find enclosing LccShelfMark for hasGenre tag ");
		}
		return SKIP_BODY;
	}
}

