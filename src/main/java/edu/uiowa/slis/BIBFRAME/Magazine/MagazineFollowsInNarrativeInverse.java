package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineFollowsInNarrativeInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineFollowsInNarrativeInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineFollowsInNarrativeInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineFollowsInNarrativeInverseIterator theMagazineFollowsInNarrativeInverseIterator = (MagazineFollowsInNarrativeInverseIterator)findAncestorWithClass(this, MagazineFollowsInNarrativeInverseIterator.class);
			pageContext.getOut().print(theMagazineFollowsInNarrativeInverseIterator.getFollowsInNarrativeInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for followsInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for followsInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

