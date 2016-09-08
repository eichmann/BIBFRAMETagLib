package edu.uiowa.slis.BIBFRAME.TranslatedTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslatedTitleIsPreferredTitleOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TranslatedTitleIsPreferredTitleOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslatedTitleIsPreferredTitleOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TranslatedTitleIsPreferredTitleOfIterator theTranslatedTitleIsPreferredTitleOfIterator = (TranslatedTitleIsPreferredTitleOfIterator)findAncestorWithClass(this, TranslatedTitleIsPreferredTitleOfIterator.class);
			pageContext.getOut().print(theTranslatedTitleIsPreferredTitleOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing TranslatedTitle for isPreferredTitleOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing TranslatedTitle for isPreferredTitleOf tag ");
		}
		return SKIP_BODY;
	}
}

