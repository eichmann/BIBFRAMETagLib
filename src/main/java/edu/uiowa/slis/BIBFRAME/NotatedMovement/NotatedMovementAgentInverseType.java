package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementAgentInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementAgentInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementAgentInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementAgentInverseIterator theNotatedMovementAgentInverseIterator = (NotatedMovementAgentInverseIterator)findAncestorWithClass(this, NotatedMovementAgentInverseIterator.class);
			pageContext.getOut().print(theNotatedMovementAgentInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for agent tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for agent tag ");
		}
		return SKIP_BODY;
	}
}

