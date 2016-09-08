package edu.uiowa.slis.BIBFRAME.TranslatedTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslatedTitleHasPart extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TranslatedTitleHasPart currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslatedTitleHasPart.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TranslatedTitleHasPartIterator theTranslatedTitleHasPartIterator = (TranslatedTitleHasPartIterator)findAncestorWithClass(this, TranslatedTitleHasPartIterator.class);
			pageContext.getOut().print(theTranslatedTitleHasPartIterator.getHasPart());
		} catch (Exception e) {
			log.error("Can't find enclosing TranslatedTitle for hasPart tag ", e);
			throw new JspTagException("Error: Can't find enclosing TranslatedTitle for hasPart tag ");
		}
		return SKIP_BODY;
	}
}

