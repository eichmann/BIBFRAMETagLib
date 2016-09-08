package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionFollowsInNarrative extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionFollowsInNarrative currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionFollowsInNarrative.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionFollowsInNarrativeIterator theCollectionFollowsInNarrativeIterator = (CollectionFollowsInNarrativeIterator)findAncestorWithClass(this, CollectionFollowsInNarrativeIterator.class);
			pageContext.getOut().print(theCollectionFollowsInNarrativeIterator.getFollowsInNarrative());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for followsInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for followsInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

