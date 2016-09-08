package edu.uiowa.slis.BIBFRAME.TransliteratedTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TransliteratedTitleIsPreferredTitleOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TransliteratedTitleIsPreferredTitleOf currentInstance = null;
	private static final Log log = LogFactory.getLog(TransliteratedTitleIsPreferredTitleOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TransliteratedTitleIsPreferredTitleOfIterator theTransliteratedTitleIsPreferredTitleOfIterator = (TransliteratedTitleIsPreferredTitleOfIterator)findAncestorWithClass(this, TransliteratedTitleIsPreferredTitleOfIterator.class);
			pageContext.getOut().print(theTransliteratedTitleIsPreferredTitleOfIterator.getIsPreferredTitleOf());
		} catch (Exception e) {
			log.error("Can't find enclosing TransliteratedTitle for isPreferredTitleOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing TransliteratedTitle for isPreferredTitleOf tag ");
		}
		return SKIP_BODY;
	}
}

