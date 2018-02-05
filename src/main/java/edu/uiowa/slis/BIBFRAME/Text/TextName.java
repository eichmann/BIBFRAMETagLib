package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextName extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextName currentInstance = null;
	private static final Log log = LogFactory.getLog(TextName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TextNameIterator theText = (TextNameIterator)findAncestorWithClass(this, TextNameIterator.class);
			pageContext.getOut().print(theText.getName());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for name tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for name tag ");
		}
		return SKIP_BODY;
	}
}

