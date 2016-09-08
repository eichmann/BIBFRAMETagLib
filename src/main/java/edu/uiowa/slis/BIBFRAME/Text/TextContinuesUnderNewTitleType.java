package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextContinuesUnderNewTitleType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextContinuesUnderNewTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(TextContinuesUnderNewTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextContinuesUnderNewTitleIterator theTextContinuesUnderNewTitleIterator = (TextContinuesUnderNewTitleIterator)findAncestorWithClass(this, TextContinuesUnderNewTitleIterator.class);
			pageContext.getOut().print(theTextContinuesUnderNewTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for continuesUnderNewTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for continuesUnderNewTitle tag ");
		}
		return SKIP_BODY;
	}
}

