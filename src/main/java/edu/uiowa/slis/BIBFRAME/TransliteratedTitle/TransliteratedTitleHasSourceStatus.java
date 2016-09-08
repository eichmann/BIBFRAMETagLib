package edu.uiowa.slis.BIBFRAME.TransliteratedTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TransliteratedTitleHasSourceStatus extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TransliteratedTitleHasSourceStatus currentInstance = null;
	private static final Log log = LogFactory.getLog(TransliteratedTitleHasSourceStatus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TransliteratedTitleHasSourceStatusIterator theTransliteratedTitleHasSourceStatusIterator = (TransliteratedTitleHasSourceStatusIterator)findAncestorWithClass(this, TransliteratedTitleHasSourceStatusIterator.class);
			pageContext.getOut().print(theTransliteratedTitleHasSourceStatusIterator.getHasSourceStatus());
		} catch (Exception e) {
			log.error("Can't find enclosing TransliteratedTitle for hasSourceStatus tag ", e);
			throw new JspTagException("Error: Can't find enclosing TransliteratedTitle for hasSourceStatus tag ");
		}
		return SKIP_BODY;
	}
}

