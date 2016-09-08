package edu.uiowa.slis.BIBFRAME.TransliteratedTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TransliteratedTitleHasPart extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TransliteratedTitleHasPart currentInstance = null;
	private static final Log log = LogFactory.getLog(TransliteratedTitleHasPart.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TransliteratedTitleHasPartIterator theTransliteratedTitleHasPartIterator = (TransliteratedTitleHasPartIterator)findAncestorWithClass(this, TransliteratedTitleHasPartIterator.class);
			pageContext.getOut().print(theTransliteratedTitleHasPartIterator.getHasPart());
		} catch (Exception e) {
			log.error("Can't find enclosing TransliteratedTitle for hasPart tag ", e);
			throw new JspTagException("Error: Can't find enclosing TransliteratedTitle for hasPart tag ");
		}
		return SKIP_BODY;
	}
}

