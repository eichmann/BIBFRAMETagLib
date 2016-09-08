package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextIsUnionOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextIsUnionOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(TextIsUnionOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextIsUnionOfIterator theTextIsUnionOfIterator = (TextIsUnionOfIterator)findAncestorWithClass(this, TextIsUnionOfIterator.class);
			pageContext.getOut().print(theTextIsUnionOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for isUnionOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for isUnionOf tag ");
		}
		return SKIP_BODY;
	}
}

