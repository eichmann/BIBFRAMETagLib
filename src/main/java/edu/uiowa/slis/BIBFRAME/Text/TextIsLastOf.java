package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextIsLastOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextIsLastOf currentInstance = null;
	private static final Log log = LogFactory.getLog(TextIsLastOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextIsLastOfIterator theTextIsLastOfIterator = (TextIsLastOfIterator)findAncestorWithClass(this, TextIsLastOfIterator.class);
			pageContext.getOut().print(theTextIsLastOfIterator.getIsLastOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for isLastOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for isLastOf tag ");
		}
		return SKIP_BODY;
	}
}

