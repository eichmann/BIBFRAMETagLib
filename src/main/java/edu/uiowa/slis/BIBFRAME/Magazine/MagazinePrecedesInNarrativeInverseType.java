package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazinePrecedesInNarrativeInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazinePrecedesInNarrativeInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazinePrecedesInNarrativeInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazinePrecedesInNarrativeInverseIterator theMagazinePrecedesInNarrativeInverseIterator = (MagazinePrecedesInNarrativeInverseIterator)findAncestorWithClass(this, MagazinePrecedesInNarrativeInverseIterator.class);
			pageContext.getOut().print(theMagazinePrecedesInNarrativeInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for precedesInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for precedesInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

