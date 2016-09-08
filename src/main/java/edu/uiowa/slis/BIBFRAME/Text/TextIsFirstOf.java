package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextIsFirstOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextIsFirstOf currentInstance = null;
	private static final Log log = LogFactory.getLog(TextIsFirstOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextIsFirstOfIterator theTextIsFirstOfIterator = (TextIsFirstOfIterator)findAncestorWithClass(this, TextIsFirstOfIterator.class);
			pageContext.getOut().print(theTextIsFirstOfIterator.getIsFirstOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for isFirstOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for isFirstOf tag ");
		}
		return SKIP_BODY;
	}
}

