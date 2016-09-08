package edu.uiowa.slis.BIBFRAME.TransliteratedTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TransliteratedTitleIsTitleOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TransliteratedTitleIsTitleOf currentInstance = null;
	private static final Log log = LogFactory.getLog(TransliteratedTitleIsTitleOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TransliteratedTitleIsTitleOfIterator theTransliteratedTitleIsTitleOfIterator = (TransliteratedTitleIsTitleOfIterator)findAncestorWithClass(this, TransliteratedTitleIsTitleOfIterator.class);
			pageContext.getOut().print(theTransliteratedTitleIsTitleOfIterator.getIsTitleOf());
		} catch (Exception e) {
			log.error("Can't find enclosing TransliteratedTitle for isTitleOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing TransliteratedTitle for isTitleOf tag ");
		}
		return SKIP_BODY;
	}
}

