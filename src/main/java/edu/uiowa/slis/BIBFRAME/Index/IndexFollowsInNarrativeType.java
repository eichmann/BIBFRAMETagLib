package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexFollowsInNarrativeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexFollowsInNarrativeType currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexFollowsInNarrativeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexFollowsInNarrativeIterator theIndexFollowsInNarrativeIterator = (IndexFollowsInNarrativeIterator)findAncestorWithClass(this, IndexFollowsInNarrativeIterator.class);
			pageContext.getOut().print(theIndexFollowsInNarrativeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for followsInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for followsInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

