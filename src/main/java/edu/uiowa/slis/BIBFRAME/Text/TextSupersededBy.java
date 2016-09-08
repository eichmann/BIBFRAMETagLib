package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextSupersededBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextSupersededBy currentInstance = null;
	private static final Log log = LogFactory.getLog(TextSupersededBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextSupersededByIterator theTextSupersededByIterator = (TextSupersededByIterator)findAncestorWithClass(this, TextSupersededByIterator.class);
			pageContext.getOut().print(theTextSupersededByIterator.getSupersededBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for supersededBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for supersededBy tag ");
		}
		return SKIP_BODY;
	}
}

