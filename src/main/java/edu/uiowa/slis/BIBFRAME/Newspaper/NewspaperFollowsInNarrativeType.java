package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperFollowsInNarrativeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperFollowsInNarrativeType currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperFollowsInNarrativeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperFollowsInNarrativeIterator theNewspaperFollowsInNarrativeIterator = (NewspaperFollowsInNarrativeIterator)findAncestorWithClass(this, NewspaperFollowsInNarrativeIterator.class);
			pageContext.getOut().print(theNewspaperFollowsInNarrativeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for followsInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for followsInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

