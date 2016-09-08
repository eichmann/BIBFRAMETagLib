package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographFollowsInNarrative extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographFollowsInNarrative currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographFollowsInNarrative.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographFollowsInNarrativeIterator theMonographFollowsInNarrativeIterator = (MonographFollowsInNarrativeIterator)findAncestorWithClass(this, MonographFollowsInNarrativeIterator.class);
			pageContext.getOut().print(theMonographFollowsInNarrativeIterator.getFollowsInNarrative());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for followsInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for followsInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

