package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementSupplements extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementSupplements currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementSupplements.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementSupplementsIterator theNotatedMovementSupplementsIterator = (NotatedMovementSupplementsIterator)findAncestorWithClass(this, NotatedMovementSupplementsIterator.class);
			pageContext.getOut().print(theNotatedMovementSupplementsIterator.getSupplements());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for supplements tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for supplements tag ");
		}
		return SKIP_BODY;
	}
}

