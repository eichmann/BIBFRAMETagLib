package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperFollowsInNarrativeInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperFollowsInNarrativeInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperFollowsInNarrativeInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperFollowsInNarrativeInverseIterator theNewspaperFollowsInNarrativeInverseIterator = (NewspaperFollowsInNarrativeInverseIterator)findAncestorWithClass(this, NewspaperFollowsInNarrativeInverseIterator.class);
			pageContext.getOut().print(theNewspaperFollowsInNarrativeInverseIterator.getFollowsInNarrativeInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for followsInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for followsInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

