package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextTranslatedAsType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextTranslatedAsType currentInstance = null;
	private static final Log log = LogFactory.getLog(TextTranslatedAsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextTranslatedAsIterator theTextTranslatedAsIterator = (TextTranslatedAsIterator)findAncestorWithClass(this, TextTranslatedAsIterator.class);
			pageContext.getOut().print(theTextTranslatedAsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for translatedAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for translatedAs tag ");
		}
		return SKIP_BODY;
	}
}

