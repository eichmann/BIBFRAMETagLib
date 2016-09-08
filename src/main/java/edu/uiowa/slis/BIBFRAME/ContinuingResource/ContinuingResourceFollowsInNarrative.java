package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourceFollowsInNarrative extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourceFollowsInNarrative currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourceFollowsInNarrative.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourceFollowsInNarrativeIterator theContinuingResourceFollowsInNarrativeIterator = (ContinuingResourceFollowsInNarrativeIterator)findAncestorWithClass(this, ContinuingResourceFollowsInNarrativeIterator.class);
			pageContext.getOut().print(theContinuingResourceFollowsInNarrativeIterator.getFollowsInNarrative());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for followsInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for followsInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

