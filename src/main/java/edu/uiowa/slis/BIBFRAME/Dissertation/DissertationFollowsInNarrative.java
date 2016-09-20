package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationFollowsInNarrative extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationFollowsInNarrative currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationFollowsInNarrative.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DissertationFollowsInNarrativeIterator theDissertationFollowsInNarrativeIterator = (DissertationFollowsInNarrativeIterator)findAncestorWithClass(this, DissertationFollowsInNarrativeIterator.class);
			pageContext.getOut().print(theDissertationFollowsInNarrativeIterator.getFollowsInNarrative());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for followsInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for followsInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

