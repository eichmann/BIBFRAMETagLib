package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextIsFirstOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextIsFirstOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(TextIsFirstOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextIsFirstOfIterator theTextIsFirstOfIterator = (TextIsFirstOfIterator)findAncestorWithClass(this, TextIsFirstOfIterator.class);
			pageContext.getOut().print(theTextIsFirstOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for isFirstOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for isFirstOf tag ");
		}
		return SKIP_BODY;
	}
}

