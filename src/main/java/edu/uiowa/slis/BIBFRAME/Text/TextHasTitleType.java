package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextHasTitleType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextHasTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(TextHasTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextHasTitleIterator theTextHasTitleIterator = (TextHasTitleIterator)findAncestorWithClass(this, TextHasTitleIterator.class);
			pageContext.getOut().print(theTextHasTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

