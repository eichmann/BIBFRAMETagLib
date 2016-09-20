package edu.uiowa.slis.BIBFRAME.NlmShelfMark;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NlmShelfMarkHasGenreInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NlmShelfMarkHasGenreInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(NlmShelfMarkHasGenreInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NlmShelfMarkHasGenreInverseIterator theNlmShelfMarkHasGenreInverseIterator = (NlmShelfMarkHasGenreInverseIterator)findAncestorWithClass(this, NlmShelfMarkHasGenreInverseIterator.class);
			pageContext.getOut().print(theNlmShelfMarkHasGenreInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NlmShelfMark for hasGenre tag ", e);
			throw new JspTagException("Error: Can't find enclosing NlmShelfMark for hasGenre tag ");
		}
		return SKIP_BODY;
	}
}

