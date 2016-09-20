package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperSeparatedInto extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperSeparatedInto currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperSeparatedInto.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperSeparatedIntoIterator theNewspaperSeparatedIntoIterator = (NewspaperSeparatedIntoIterator)findAncestorWithClass(this, NewspaperSeparatedIntoIterator.class);
			pageContext.getOut().print(theNewspaperSeparatedIntoIterator.getSeparatedInto());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for separatedInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for separatedInto tag ");
		}
		return SKIP_BODY;
	}
}

