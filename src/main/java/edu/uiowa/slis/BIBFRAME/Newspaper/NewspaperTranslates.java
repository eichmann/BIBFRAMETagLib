package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperTranslates extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperTranslates currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperTranslates.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperTranslatesIterator theNewspaperTranslatesIterator = (NewspaperTranslatesIterator)findAncestorWithClass(this, NewspaperTranslatesIterator.class);
			pageContext.getOut().print(theNewspaperTranslatesIterator.getTranslates());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for translates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for translates tag ");
		}
		return SKIP_BODY;
	}
}

