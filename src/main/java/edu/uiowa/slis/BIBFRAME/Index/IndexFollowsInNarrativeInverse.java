package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexFollowsInNarrativeInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexFollowsInNarrativeInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexFollowsInNarrativeInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexFollowsInNarrativeInverseIterator theIndexFollowsInNarrativeInverseIterator = (IndexFollowsInNarrativeInverseIterator)findAncestorWithClass(this, IndexFollowsInNarrativeInverseIterator.class);
			pageContext.getOut().print(theIndexFollowsInNarrativeInverseIterator.getFollowsInNarrativeInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for followsInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for followsInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

