package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementHasPart extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementHasPart currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementHasPart.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementHasPartIterator theNotatedMovementHasPartIterator = (NotatedMovementHasPartIterator)findAncestorWithClass(this, NotatedMovementHasPartIterator.class);
			pageContext.getOut().print(theNotatedMovementHasPartIterator.getHasPart());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for hasPart tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for hasPart tag ");
		}
		return SKIP_BODY;
	}
}

