package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationPrecedesInNarrativeInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationPrecedesInNarrativeInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationPrecedesInNarrativeInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DissertationPrecedesInNarrativeInverseIterator theDissertationPrecedesInNarrativeInverseIterator = (DissertationPrecedesInNarrativeInverseIterator)findAncestorWithClass(this, DissertationPrecedesInNarrativeInverseIterator.class);
			pageContext.getOut().print(theDissertationPrecedesInNarrativeInverseIterator.getPrecedesInNarrativeInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for precedesInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for precedesInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

