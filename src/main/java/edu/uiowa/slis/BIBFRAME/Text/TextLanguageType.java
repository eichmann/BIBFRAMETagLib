package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextLanguageType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextLanguageType currentInstance = null;
	private static final Log log = LogFactory.getLog(TextLanguageType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextLanguageIterator theTextLanguageIterator = (TextLanguageIterator)findAncestorWithClass(this, TextLanguageIterator.class);
			pageContext.getOut().print(theTextLanguageIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for language tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for language tag ");
		}
		return SKIP_BODY;
	}
}

