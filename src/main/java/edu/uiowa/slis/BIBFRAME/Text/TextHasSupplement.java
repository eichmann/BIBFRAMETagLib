package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextHasSupplement extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextHasSupplement currentInstance = null;
	private static final Log log = LogFactory.getLog(TextHasSupplement.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextHasSupplementIterator theTextHasSupplementIterator = (TextHasSupplementIterator)findAncestorWithClass(this, TextHasSupplementIterator.class);
			pageContext.getOut().print(theTextHasSupplementIterator.getHasSupplement());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for hasSupplement tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for hasSupplement tag ");
		}
		return SKIP_BODY;
	}
}

