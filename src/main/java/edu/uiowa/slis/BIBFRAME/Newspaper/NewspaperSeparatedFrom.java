package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperSeparatedFrom extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperSeparatedFrom currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperSeparatedFrom.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperSeparatedFromIterator theNewspaperSeparatedFromIterator = (NewspaperSeparatedFromIterator)findAncestorWithClass(this, NewspaperSeparatedFromIterator.class);
			pageContext.getOut().print(theNewspaperSeparatedFromIterator.getSeparatedFrom());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for separatedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for separatedFrom tag ");
		}
		return SKIP_BODY;
	}
}

