package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementReceived extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementReceived currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementReceived.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementReceivedIterator theNotatedMovementReceivedIterator = (NotatedMovementReceivedIterator)findAncestorWithClass(this, NotatedMovementReceivedIterator.class);
			pageContext.getOut().print(theNotatedMovementReceivedIterator.getReceived());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for received tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for received tag ");
		}
		return SKIP_BODY;
	}
}

