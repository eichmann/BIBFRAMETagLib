package edu.uiowa.slis.BIBFRAME.SourceStatus;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SourceStatusHasGenreInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SourceStatusHasGenreInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(SourceStatusHasGenreInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SourceStatusHasGenreInverseIterator theSourceStatusHasGenreInverseIterator = (SourceStatusHasGenreInverseIterator)findAncestorWithClass(this, SourceStatusHasGenreInverseIterator.class);
			pageContext.getOut().print(theSourceStatusHasGenreInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing SourceStatus for hasGenre tag ", e);
			throw new JspTagException("Error: Can't find enclosing SourceStatus for hasGenre tag ");
		}
		return SKIP_BODY;
	}
}

