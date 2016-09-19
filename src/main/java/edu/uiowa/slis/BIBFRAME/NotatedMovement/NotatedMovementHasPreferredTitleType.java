package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementHasPreferredTitleType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementHasPreferredTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementHasPreferredTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementHasPreferredTitleIterator theNotatedMovementHasPreferredTitleIterator = (NotatedMovementHasPreferredTitleIterator)findAncestorWithClass(this, NotatedMovementHasPreferredTitleIterator.class);
			pageContext.getOut().print(theNotatedMovementHasPreferredTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for hasPreferredTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for hasPreferredTitle tag ");
		}
		return SKIP_BODY;
	}
}

