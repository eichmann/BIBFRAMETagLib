package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementHasTitleType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementHasTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementHasTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementHasTitleIterator theNotatedMovementHasTitleIterator = (NotatedMovementHasTitleIterator)findAncestorWithClass(this, NotatedMovementHasTitleIterator.class);
			pageContext.getOut().print(theNotatedMovementHasTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

