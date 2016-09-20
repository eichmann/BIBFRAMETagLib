package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationPrecedesInNarrativeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationPrecedesInNarrativeType currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationPrecedesInNarrativeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DissertationPrecedesInNarrativeIterator theDissertationPrecedesInNarrativeIterator = (DissertationPrecedesInNarrativeIterator)findAncestorWithClass(this, DissertationPrecedesInNarrativeIterator.class);
			pageContext.getOut().print(theDissertationPrecedesInNarrativeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for precedesInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for precedesInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

