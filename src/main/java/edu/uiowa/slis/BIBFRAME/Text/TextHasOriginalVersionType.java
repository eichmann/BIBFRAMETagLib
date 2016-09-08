package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextHasOriginalVersionType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextHasOriginalVersionType currentInstance = null;
	private static final Log log = LogFactory.getLog(TextHasOriginalVersionType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextHasOriginalVersionIterator theTextHasOriginalVersionIterator = (TextHasOriginalVersionIterator)findAncestorWithClass(this, TextHasOriginalVersionIterator.class);
			pageContext.getOut().print(theTextHasOriginalVersionIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for hasOriginalVersion tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for hasOriginalVersion tag ");
		}
		return SKIP_BODY;
	}
}

