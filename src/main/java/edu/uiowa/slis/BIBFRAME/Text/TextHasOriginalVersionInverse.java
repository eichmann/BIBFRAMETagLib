package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextHasOriginalVersionInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextHasOriginalVersionInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(TextHasOriginalVersionInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextHasOriginalVersionInverseIterator theTextHasOriginalVersionInverseIterator = (TextHasOriginalVersionInverseIterator)findAncestorWithClass(this, TextHasOriginalVersionInverseIterator.class);
			pageContext.getOut().print(theTextHasOriginalVersionInverseIterator.getHasOriginalVersionInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for hasOriginalVersion tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for hasOriginalVersion tag ");
		}
		return SKIP_BODY;
	}
}

