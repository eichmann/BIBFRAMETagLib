package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextSeparatedInto extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextSeparatedInto currentInstance = null;
	private static final Log log = LogFactory.getLog(TextSeparatedInto.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextSeparatedIntoIterator theTextSeparatedIntoIterator = (TextSeparatedIntoIterator)findAncestorWithClass(this, TextSeparatedIntoIterator.class);
			pageContext.getOut().print(theTextSeparatedIntoIterator.getSeparatedInto());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for separatedInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for separatedInto tag ");
		}
		return SKIP_BODY;
	}
}

