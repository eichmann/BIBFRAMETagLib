package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperIsFirstOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperIsFirstOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperIsFirstOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperIsFirstOfIterator theNewspaperIsFirstOfIterator = (NewspaperIsFirstOfIterator)findAncestorWithClass(this, NewspaperIsFirstOfIterator.class);
			pageContext.getOut().print(theNewspaperIsFirstOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for isFirstOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for isFirstOf tag ");
		}
		return SKIP_BODY;
	}
}

