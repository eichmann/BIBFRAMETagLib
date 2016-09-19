package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourcePrecedesInNarrativeInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourcePrecedesInNarrativeInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourcePrecedesInNarrativeInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FiniteResourcePrecedesInNarrativeInverseIterator theFiniteResourcePrecedesInNarrativeInverseIterator = (FiniteResourcePrecedesInNarrativeInverseIterator)findAncestorWithClass(this, FiniteResourcePrecedesInNarrativeInverseIterator.class);
			pageContext.getOut().print(theFiniteResourcePrecedesInNarrativeInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for precedesInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for precedesInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

