package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographLanguage extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographLanguage currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographLanguage.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographLanguageIterator theMultipartMonographLanguageIterator = (MultipartMonographLanguageIterator)findAncestorWithClass(this, MultipartMonographLanguageIterator.class);
			pageContext.getOut().print(theMultipartMonographLanguageIterator.getLanguage());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for language tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for language tag ");
		}
		return SKIP_BODY;
	}
}

