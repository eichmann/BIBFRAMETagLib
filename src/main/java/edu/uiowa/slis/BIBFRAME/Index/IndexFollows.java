package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexFollows extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexFollows currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexFollows.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexFollowsIterator theIndexFollowsIterator = (IndexFollowsIterator)findAncestorWithClass(this, IndexFollowsIterator.class);
			pageContext.getOut().print(theIndexFollowsIterator.getFollows());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for follows tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for follows tag ");
		}
		return SKIP_BODY;
	}
}

