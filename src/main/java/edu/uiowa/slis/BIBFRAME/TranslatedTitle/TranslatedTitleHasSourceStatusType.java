package edu.uiowa.slis.BIBFRAME.TranslatedTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslatedTitleHasSourceStatusType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TranslatedTitleHasSourceStatusType currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslatedTitleHasSourceStatusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TranslatedTitleHasSourceStatusIterator theTranslatedTitleHasSourceStatusIterator = (TranslatedTitleHasSourceStatusIterator)findAncestorWithClass(this, TranslatedTitleHasSourceStatusIterator.class);
			pageContext.getOut().print(theTranslatedTitleHasSourceStatusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing TranslatedTitle for hasSourceStatus tag ", e);
			throw new JspTagException("Error: Can't find enclosing TranslatedTitle for hasSourceStatus tag ");
		}
		return SKIP_BODY;
	}
}

