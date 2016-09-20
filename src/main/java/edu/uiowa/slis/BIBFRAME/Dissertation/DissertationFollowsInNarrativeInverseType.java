package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationFollowsInNarrativeInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationFollowsInNarrativeInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationFollowsInNarrativeInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DissertationFollowsInNarrativeInverseIterator theDissertationFollowsInNarrativeInverseIterator = (DissertationFollowsInNarrativeInverseIterator)findAncestorWithClass(this, DissertationFollowsInNarrativeInverseIterator.class);
			pageContext.getOut().print(theDissertationFollowsInNarrativeInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for followsInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for followsInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

