package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperFollowsType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperFollowsType currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperFollowsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperFollowsIterator theNewspaperFollowsIterator = (NewspaperFollowsIterator)findAncestorWithClass(this, NewspaperFollowsIterator.class);
			pageContext.getOut().print(theNewspaperFollowsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for follows tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for follows tag ");
		}
		return SKIP_BODY;
	}
}

