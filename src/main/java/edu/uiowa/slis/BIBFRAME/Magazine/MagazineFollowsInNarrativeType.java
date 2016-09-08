package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineFollowsInNarrativeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineFollowsInNarrativeType currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineFollowsInNarrativeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineFollowsInNarrativeIterator theMagazineFollowsInNarrativeIterator = (MagazineFollowsInNarrativeIterator)findAncestorWithClass(this, MagazineFollowsInNarrativeIterator.class);
			pageContext.getOut().print(theMagazineFollowsInNarrativeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for followsInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for followsInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

