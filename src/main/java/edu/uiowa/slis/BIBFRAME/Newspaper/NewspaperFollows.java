package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperFollows extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperFollows currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperFollows.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperFollowsIterator theNewspaperFollowsIterator = (NewspaperFollowsIterator)findAncestorWithClass(this, NewspaperFollowsIterator.class);
			pageContext.getOut().print(theNewspaperFollowsIterator.getFollows());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for follows tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for follows tag ");
		}
		return SKIP_BODY;
	}
}

