package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourceFollowsInNarrativeInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourceFollowsInNarrativeInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourceFollowsInNarrativeInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourceFollowsInNarrativeInverseIterator theContinuingResourceFollowsInNarrativeInverseIterator = (ContinuingResourceFollowsInNarrativeInverseIterator)findAncestorWithClass(this, ContinuingResourceFollowsInNarrativeInverseIterator.class);
			pageContext.getOut().print(theContinuingResourceFollowsInNarrativeInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for followsInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for followsInNarrative tag ");
		}
		return SKIP_BODY;
	}
}
