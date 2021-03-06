package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextHasTitle extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextHasTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(TextHasTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextHasTitleIterator theTextHasTitleIterator = (TextHasTitleIterator)findAncestorWithClass(this, TextHasTitleIterator.class);
			pageContext.getOut().print(theTextHasTitleIterator.getHasTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

