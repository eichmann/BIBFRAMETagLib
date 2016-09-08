package edu.uiowa.slis.BIBFRAME.TranslatedTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslatedTitleIsTitleOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TranslatedTitleIsTitleOf currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslatedTitleIsTitleOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TranslatedTitleIsTitleOfIterator theTranslatedTitleIsTitleOfIterator = (TranslatedTitleIsTitleOfIterator)findAncestorWithClass(this, TranslatedTitleIsTitleOfIterator.class);
			pageContext.getOut().print(theTranslatedTitleIsTitleOfIterator.getIsTitleOf());
		} catch (Exception e) {
			log.error("Can't find enclosing TranslatedTitle for isTitleOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing TranslatedTitle for isTitleOf tag ");
		}
		return SKIP_BODY;
	}
}

