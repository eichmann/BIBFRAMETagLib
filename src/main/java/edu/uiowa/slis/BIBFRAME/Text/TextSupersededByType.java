package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextSupersededByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextSupersededByType currentInstance = null;
	private static final Log log = LogFactory.getLog(TextSupersededByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextSupersededByIterator theTextSupersededByIterator = (TextSupersededByIterator)findAncestorWithClass(this, TextSupersededByIterator.class);
			pageContext.getOut().print(theTextSupersededByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for supersededBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for supersededBy tag ");
		}
		return SKIP_BODY;
	}
}

