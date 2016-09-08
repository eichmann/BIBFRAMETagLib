package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourceFollowsInNarrativeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourceFollowsInNarrativeType currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourceFollowsInNarrativeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourceFollowsInNarrativeIterator theContinuingResourceFollowsInNarrativeIterator = (ContinuingResourceFollowsInNarrativeIterator)findAncestorWithClass(this, ContinuingResourceFollowsInNarrativeIterator.class);
			pageContext.getOut().print(theContinuingResourceFollowsInNarrativeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for followsInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for followsInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

