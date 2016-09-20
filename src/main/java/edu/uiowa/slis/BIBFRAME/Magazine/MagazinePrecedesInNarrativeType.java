package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazinePrecedesInNarrativeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazinePrecedesInNarrativeType currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazinePrecedesInNarrativeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazinePrecedesInNarrativeIterator theMagazinePrecedesInNarrativeIterator = (MagazinePrecedesInNarrativeIterator)findAncestorWithClass(this, MagazinePrecedesInNarrativeIterator.class);
			pageContext.getOut().print(theMagazinePrecedesInNarrativeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for precedesInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for precedesInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

