package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementTranslates extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementTranslates currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementTranslates.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementTranslatesIterator theNotatedMovementTranslatesIterator = (NotatedMovementTranslatesIterator)findAncestorWithClass(this, NotatedMovementTranslatesIterator.class);
			pageContext.getOut().print(theNotatedMovementTranslatesIterator.getTranslates());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for translates tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for translates tag ");
		}
		return SKIP_BODY;
	}
}

