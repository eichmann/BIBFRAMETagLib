package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextHasInstanceType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextHasInstanceType currentInstance = null;
	private static final Log log = LogFactory.getLog(TextHasInstanceType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextHasInstanceIterator theTextHasInstanceIterator = (TextHasInstanceIterator)findAncestorWithClass(this, TextHasInstanceIterator.class);
			pageContext.getOut().print(theTextHasInstanceIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for hasInstance tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for hasInstance tag ");
		}
		return SKIP_BODY;
	}
}

