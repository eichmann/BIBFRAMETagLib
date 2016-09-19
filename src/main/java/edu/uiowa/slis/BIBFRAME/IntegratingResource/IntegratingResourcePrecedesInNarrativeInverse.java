package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourcePrecedesInNarrativeInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourcePrecedesInNarrativeInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourcePrecedesInNarrativeInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourcePrecedesInNarrativeInverseIterator theIntegratingResourcePrecedesInNarrativeInverseIterator = (IntegratingResourcePrecedesInNarrativeInverseIterator)findAncestorWithClass(this, IntegratingResourcePrecedesInNarrativeInverseIterator.class);
			pageContext.getOut().print(theIntegratingResourcePrecedesInNarrativeInverseIterator.getPrecedesInNarrativeInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for precedesInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for precedesInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

