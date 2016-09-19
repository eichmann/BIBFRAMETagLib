package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextHasPreferredTitle extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextHasPreferredTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(TextHasPreferredTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextHasPreferredTitleIterator theTextHasPreferredTitleIterator = (TextHasPreferredTitleIterator)findAncestorWithClass(this, TextHasPreferredTitleIterator.class);
			pageContext.getOut().print(theTextHasPreferredTitleIterator.getHasPreferredTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for hasPreferredTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for hasPreferredTitle tag ");
		}
		return SKIP_BODY;
	}
}

