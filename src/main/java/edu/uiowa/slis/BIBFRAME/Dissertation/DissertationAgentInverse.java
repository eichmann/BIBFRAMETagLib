package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationAgentInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationAgentInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationAgentInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DissertationAgentInverseIterator theDissertationAgentInverseIterator = (DissertationAgentInverseIterator)findAncestorWithClass(this, DissertationAgentInverseIterator.class);
			pageContext.getOut().print(theDissertationAgentInverseIterator.getAgentInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for agent tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for agent tag ");
		}
		return SKIP_BODY;
	}
}

