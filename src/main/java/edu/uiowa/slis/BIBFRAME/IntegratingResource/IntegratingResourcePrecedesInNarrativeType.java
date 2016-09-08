package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourcePrecedesInNarrativeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourcePrecedesInNarrativeType currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourcePrecedesInNarrativeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourcePrecedesInNarrativeIterator theIntegratingResourcePrecedesInNarrativeIterator = (IntegratingResourcePrecedesInNarrativeIterator)findAncestorWithClass(this, IntegratingResourcePrecedesInNarrativeIterator.class);
			pageContext.getOut().print(theIntegratingResourcePrecedesInNarrativeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for precedesInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for precedesInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

