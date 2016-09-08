package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextTranslatedAs extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextTranslatedAs currentInstance = null;
	private static final Log log = LogFactory.getLog(TextTranslatedAs.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextTranslatedAsIterator theTextTranslatedAsIterator = (TextTranslatedAsIterator)findAncestorWithClass(this, TextTranslatedAsIterator.class);
			pageContext.getOut().print(theTextTranslatedAsIterator.getTranslatedAs());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for translatedAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for translatedAs tag ");
		}
		return SKIP_BODY;
	}
}

