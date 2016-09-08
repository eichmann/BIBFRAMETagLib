package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextContinuedUnderNewTitleBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextContinuedUnderNewTitleBy currentInstance = null;
	private static final Log log = LogFactory.getLog(TextContinuedUnderNewTitleBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextContinuedUnderNewTitleByIterator theTextContinuedUnderNewTitleByIterator = (TextContinuedUnderNewTitleByIterator)findAncestorWithClass(this, TextContinuedUnderNewTitleByIterator.class);
			pageContext.getOut().print(theTextContinuedUnderNewTitleByIterator.getContinuedUnderNewTitleBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for continuedUnderNewTitleBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for continuedUnderNewTitleBy tag ");
		}
		return SKIP_BODY;
	}
}

