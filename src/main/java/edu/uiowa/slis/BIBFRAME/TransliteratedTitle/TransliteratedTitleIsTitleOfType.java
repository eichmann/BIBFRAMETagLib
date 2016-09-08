package edu.uiowa.slis.BIBFRAME.TransliteratedTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TransliteratedTitleIsTitleOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TransliteratedTitleIsTitleOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(TransliteratedTitleIsTitleOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TransliteratedTitleIsTitleOfIterator theTransliteratedTitleIsTitleOfIterator = (TransliteratedTitleIsTitleOfIterator)findAncestorWithClass(this, TransliteratedTitleIsTitleOfIterator.class);
			pageContext.getOut().print(theTransliteratedTitleIsTitleOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing TransliteratedTitle for isTitleOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing TransliteratedTitle for isTitleOf tag ");
		}
		return SKIP_BODY;
	}
}

