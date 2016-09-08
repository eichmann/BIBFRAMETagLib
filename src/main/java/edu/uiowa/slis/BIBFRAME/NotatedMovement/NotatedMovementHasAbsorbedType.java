package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementHasAbsorbedType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementHasAbsorbedType currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementHasAbsorbedType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementHasAbsorbedIterator theNotatedMovementHasAbsorbedIterator = (NotatedMovementHasAbsorbedIterator)findAncestorWithClass(this, NotatedMovementHasAbsorbedIterator.class);
			pageContext.getOut().print(theNotatedMovementHasAbsorbedIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for hasAbsorbed tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for hasAbsorbed tag ");
		}
		return SKIP_BODY;
	}
}

