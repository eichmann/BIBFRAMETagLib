package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationPrecedesInNarrativeInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationPrecedesInNarrativeInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationPrecedesInNarrativeInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DissertationPrecedesInNarrativeInverseIterator theDissertationPrecedesInNarrativeInverseIterator = (DissertationPrecedesInNarrativeInverseIterator)findAncestorWithClass(this, DissertationPrecedesInNarrativeInverseIterator.class);
			pageContext.getOut().print(theDissertationPrecedesInNarrativeInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for precedesInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for precedesInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

