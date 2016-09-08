package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementIsPartOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementIsPartOf currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementIsPartOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementIsPartOfIterator theNotatedMovementIsPartOfIterator = (NotatedMovementIsPartOfIterator)findAncestorWithClass(this, NotatedMovementIsPartOfIterator.class);
			pageContext.getOut().print(theNotatedMovementIsPartOfIterator.getIsPartOf());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for isPartOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for isPartOf tag ");
		}
		return SKIP_BODY;
	}
}

