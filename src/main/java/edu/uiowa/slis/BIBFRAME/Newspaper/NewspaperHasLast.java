package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperHasLast extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperHasLast currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperHasLast.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperHasLastIterator theNewspaperHasLastIterator = (NewspaperHasLastIterator)findAncestorWithClass(this, NewspaperHasLastIterator.class);
			pageContext.getOut().print(theNewspaperHasLastIterator.getHasLast());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for hasLast tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for hasLast tag ");
		}
		return SKIP_BODY;
	}
}

