package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperHasSupplementType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperHasSupplementType currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperHasSupplementType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperHasSupplementIterator theNewspaperHasSupplementIterator = (NewspaperHasSupplementIterator)findAncestorWithClass(this, NewspaperHasSupplementIterator.class);
			pageContext.getOut().print(theNewspaperHasSupplementIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for hasSupplement tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for hasSupplement tag ");
		}
		return SKIP_BODY;
	}
}

