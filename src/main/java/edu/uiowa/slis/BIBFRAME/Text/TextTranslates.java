package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextTranslates extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextTranslates currentInstance = null;
	private static final Log log = LogFactory.getLog(TextTranslates.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextTranslatesIterator theTextTranslatesIterator = (TextTranslatesIterator)findAncestorWithClass(this, TextTranslatesIterator.class);
			pageContext.getOut().print(theTextTranslatesIterator.getTranslates());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for translates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for translates tag ");
		}
		return SKIP_BODY;
	}
}

