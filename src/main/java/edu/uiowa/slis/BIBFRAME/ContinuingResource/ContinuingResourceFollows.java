package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourceFollows extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourceFollows currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourceFollows.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourceFollowsIterator theContinuingResourceFollowsIterator = (ContinuingResourceFollowsIterator)findAncestorWithClass(this, ContinuingResourceFollowsIterator.class);
			pageContext.getOut().print(theContinuingResourceFollowsIterator.getFollows());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for follows tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for follows tag ");
		}
		return SKIP_BODY;
	}
}

