package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperHasSupplement extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperHasSupplement currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperHasSupplement.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperHasSupplementIterator theNewspaperHasSupplementIterator = (NewspaperHasSupplementIterator)findAncestorWithClass(this, NewspaperHasSupplementIterator.class);
			pageContext.getOut().print(theNewspaperHasSupplementIterator.getHasSupplement());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for hasSupplement tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for hasSupplement tag ");
		}
		return SKIP_BODY;
	}
}

