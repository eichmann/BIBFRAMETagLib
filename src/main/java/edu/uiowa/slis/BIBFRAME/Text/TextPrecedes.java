package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextPrecedes extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextPrecedes currentInstance = null;
	private static final Log log = LogFactory.getLog(TextPrecedes.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextPrecedesIterator theTextPrecedesIterator = (TextPrecedesIterator)findAncestorWithClass(this, TextPrecedesIterator.class);
			pageContext.getOut().print(theTextPrecedesIterator.getPrecedes());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for precedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for precedes tag ");
		}
		return SKIP_BODY;
	}
}

