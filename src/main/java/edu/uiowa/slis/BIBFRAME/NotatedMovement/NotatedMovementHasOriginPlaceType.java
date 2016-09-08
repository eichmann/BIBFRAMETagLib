package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementHasOriginPlaceType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementHasOriginPlaceType currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementHasOriginPlaceType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementHasOriginPlaceIterator theNotatedMovementHasOriginPlaceIterator = (NotatedMovementHasOriginPlaceIterator)findAncestorWithClass(this, NotatedMovementHasOriginPlaceIterator.class);
			pageContext.getOut().print(theNotatedMovementHasOriginPlaceIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for hasOriginPlace tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for hasOriginPlace tag ");
		}
		return SKIP_BODY;
	}
}

