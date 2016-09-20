package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperHasPreferredTitle extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperHasPreferredTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperHasPreferredTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperHasPreferredTitleIterator theNewspaperHasPreferredTitleIterator = (NewspaperHasPreferredTitleIterator)findAncestorWithClass(this, NewspaperHasPreferredTitleIterator.class);
			pageContext.getOut().print(theNewspaperHasPreferredTitleIterator.getHasPreferredTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for hasPreferredTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for hasPreferredTitle tag ");
		}
		return SKIP_BODY;
	}
}

