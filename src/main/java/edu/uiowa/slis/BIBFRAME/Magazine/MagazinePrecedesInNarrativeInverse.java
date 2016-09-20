package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazinePrecedesInNarrativeInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazinePrecedesInNarrativeInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazinePrecedesInNarrativeInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazinePrecedesInNarrativeInverseIterator theMagazinePrecedesInNarrativeInverseIterator = (MagazinePrecedesInNarrativeInverseIterator)findAncestorWithClass(this, MagazinePrecedesInNarrativeInverseIterator.class);
			pageContext.getOut().print(theMagazinePrecedesInNarrativeInverseIterator.getPrecedesInNarrativeInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for precedesInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for precedesInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

