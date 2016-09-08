package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperLanguage extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperLanguage currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperLanguage.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperLanguageIterator theNewspaperLanguageIterator = (NewspaperLanguageIterator)findAncestorWithClass(this, NewspaperLanguageIterator.class);
			pageContext.getOut().print(theNewspaperLanguageIterator.getLanguage());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for language tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for language tag ");
		}
		return SKIP_BODY;
	}
}

