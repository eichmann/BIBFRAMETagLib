package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementHasAbsorbed extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementHasAbsorbed currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementHasAbsorbed.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementHasAbsorbedIterator theNotatedMovementHasAbsorbedIterator = (NotatedMovementHasAbsorbedIterator)findAncestorWithClass(this, NotatedMovementHasAbsorbedIterator.class);
			pageContext.getOut().print(theNotatedMovementHasAbsorbedIterator.getHasAbsorbed());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for hasAbsorbed tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for hasAbsorbed tag ");
		}
		return SKIP_BODY;
	}
}

