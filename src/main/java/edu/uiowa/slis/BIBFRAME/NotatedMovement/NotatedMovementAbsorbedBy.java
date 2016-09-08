package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementAbsorbedBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementAbsorbedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementAbsorbedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementAbsorbedByIterator theNotatedMovementAbsorbedByIterator = (NotatedMovementAbsorbedByIterator)findAncestorWithClass(this, NotatedMovementAbsorbedByIterator.class);
			pageContext.getOut().print(theNotatedMovementAbsorbedByIterator.getAbsorbedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for absorbedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for absorbedBy tag ");
		}
		return SKIP_BODY;
	}
}

