package edu.uiowa.slis.BIBFRAME.Instance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstanceAgentInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static InstanceAgentInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(InstanceAgentInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstanceAgentInverseIterator theInstanceAgentInverseIterator = (InstanceAgentInverseIterator)findAncestorWithClass(this, InstanceAgentInverseIterator.class);
			pageContext.getOut().print(theInstanceAgentInverseIterator.getAgentInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Instance for agent tag ", e);
			throw new JspTagException("Error: Can't find enclosing Instance for agent tag ");
		}
		return SKIP_BODY;
	}
}

