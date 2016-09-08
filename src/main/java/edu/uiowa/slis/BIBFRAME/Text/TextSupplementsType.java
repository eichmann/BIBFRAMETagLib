package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextSupplementsType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextSupplementsType currentInstance = null;
	private static final Log log = LogFactory.getLog(TextSupplementsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextSupplementsIterator theTextSupplementsIterator = (TextSupplementsIterator)findAncestorWithClass(this, TextSupplementsIterator.class);
			pageContext.getOut().print(theTextSupplementsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for supplements tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for supplements tag ");
		}
		return SKIP_BODY;
	}
}

