package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementAbsorbedByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementAbsorbedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementAbsorbedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementAbsorbedByIterator theNotatedMovementAbsorbedByIterator = (NotatedMovementAbsorbedByIterator)findAncestorWithClass(this, NotatedMovementAbsorbedByIterator.class);
			pageContext.getOut().print(theNotatedMovementAbsorbedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for absorbedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for absorbedBy tag ");
		}
		return SKIP_BODY;
	}
}

