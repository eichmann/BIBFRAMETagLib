package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographLanguage extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographLanguage currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographLanguage.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographLanguageIterator theMonographLanguageIterator = (MonographLanguageIterator)findAncestorWithClass(this, MonographLanguageIterator.class);
			pageContext.getOut().print(theMonographLanguageIterator.getLanguage());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for language tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for language tag ");
		}
		return SKIP_BODY;
	}
}

