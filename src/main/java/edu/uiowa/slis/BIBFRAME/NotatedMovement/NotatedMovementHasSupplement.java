package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementHasSupplement extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementHasSupplement currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementHasSupplement.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementHasSupplementIterator theNotatedMovementHasSupplementIterator = (NotatedMovementHasSupplementIterator)findAncestorWithClass(this, NotatedMovementHasSupplementIterator.class);
			pageContext.getOut().print(theNotatedMovementHasSupplementIterator.getHasSupplement());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for hasSupplement tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for hasSupplement tag ");
		}
		return SKIP_BODY;
	}
}

