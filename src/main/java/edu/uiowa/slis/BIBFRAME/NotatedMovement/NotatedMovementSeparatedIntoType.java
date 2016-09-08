package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementSeparatedIntoType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementSeparatedIntoType currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementSeparatedIntoType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementSeparatedIntoIterator theNotatedMovementSeparatedIntoIterator = (NotatedMovementSeparatedIntoIterator)findAncestorWithClass(this, NotatedMovementSeparatedIntoIterator.class);
			pageContext.getOut().print(theNotatedMovementSeparatedIntoIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for separatedInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for separatedInto tag ");
		}
		return SKIP_BODY;
	}
}

