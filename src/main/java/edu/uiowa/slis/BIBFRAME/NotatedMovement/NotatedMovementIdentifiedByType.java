package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementIdentifiedByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementIdentifiedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementIdentifiedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementIdentifiedByIterator theNotatedMovementIdentifiedByIterator = (NotatedMovementIdentifiedByIterator)findAncestorWithClass(this, NotatedMovementIdentifiedByIterator.class);
			pageContext.getOut().print(theNotatedMovementIdentifiedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for identifiedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for identifiedBy tag ");
		}
		return SKIP_BODY;
	}
}
