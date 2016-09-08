package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextSeparatedFromType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextSeparatedFromType currentInstance = null;
	private static final Log log = LogFactory.getLog(TextSeparatedFromType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextSeparatedFromIterator theTextSeparatedFromIterator = (TextSeparatedFromIterator)findAncestorWithClass(this, TextSeparatedFromIterator.class);
			pageContext.getOut().print(theTextSeparatedFromIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for separatedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for separatedFrom tag ");
		}
		return SKIP_BODY;
	}
}

