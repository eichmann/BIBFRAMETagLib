package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextIsPartOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextIsPartOf currentInstance = null;
	private static final Log log = LogFactory.getLog(TextIsPartOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextIsPartOfIterator theTextIsPartOfIterator = (TextIsPartOfIterator)findAncestorWithClass(this, TextIsPartOfIterator.class);
			pageContext.getOut().print(theTextIsPartOfIterator.getIsPartOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for isPartOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for isPartOf tag ");
		}
		return SKIP_BODY;
	}
}

