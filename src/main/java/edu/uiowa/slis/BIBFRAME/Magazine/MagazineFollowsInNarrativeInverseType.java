package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineFollowsInNarrativeInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineFollowsInNarrativeInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineFollowsInNarrativeInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineFollowsInNarrativeInverseIterator theMagazineFollowsInNarrativeInverseIterator = (MagazineFollowsInNarrativeInverseIterator)findAncestorWithClass(this, MagazineFollowsInNarrativeInverseIterator.class);
			pageContext.getOut().print(theMagazineFollowsInNarrativeInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for followsInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for followsInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

