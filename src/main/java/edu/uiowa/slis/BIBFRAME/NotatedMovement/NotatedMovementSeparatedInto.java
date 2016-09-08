package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementSeparatedInto extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementSeparatedInto currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementSeparatedInto.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementSeparatedIntoIterator theNotatedMovementSeparatedIntoIterator = (NotatedMovementSeparatedIntoIterator)findAncestorWithClass(this, NotatedMovementSeparatedIntoIterator.class);
			pageContext.getOut().print(theNotatedMovementSeparatedIntoIterator.getSeparatedInto());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for separatedInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for separatedInto tag ");
		}
		return SKIP_BODY;
	}
}

