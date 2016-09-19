package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionFollowsInNarrativeInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionFollowsInNarrativeInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionFollowsInNarrativeInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionFollowsInNarrativeInverseIterator theCollectionFollowsInNarrativeInverseIterator = (CollectionFollowsInNarrativeInverseIterator)findAncestorWithClass(this, CollectionFollowsInNarrativeInverseIterator.class);
			pageContext.getOut().print(theCollectionFollowsInNarrativeInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for followsInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for followsInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

