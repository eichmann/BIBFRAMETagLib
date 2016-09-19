package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextFollows extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextFollows currentInstance = null;
	private static final Log log = LogFactory.getLog(TextFollows.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextFollowsIterator theTextFollowsIterator = (TextFollowsIterator)findAncestorWithClass(this, TextFollowsIterator.class);
			pageContext.getOut().print(theTextFollowsIterator.getFollows());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for follows tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for follows tag ");
		}
		return SKIP_BODY;
	}
}

