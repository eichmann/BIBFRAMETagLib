package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceFollows extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceFollows currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceFollows.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FiniteResourceFollowsIterator theFiniteResourceFollowsIterator = (FiniteResourceFollowsIterator)findAncestorWithClass(this, FiniteResourceFollowsIterator.class);
			pageContext.getOut().print(theFiniteResourceFollowsIterator.getFollows());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for follows tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for follows tag ");
		}
		return SKIP_BODY;
	}
}

