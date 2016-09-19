package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementHasPreferredTitle extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementHasPreferredTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementHasPreferredTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementHasPreferredTitleIterator theNotatedMovementHasPreferredTitleIterator = (NotatedMovementHasPreferredTitleIterator)findAncestorWithClass(this, NotatedMovementHasPreferredTitleIterator.class);
			pageContext.getOut().print(theNotatedMovementHasPreferredTitleIterator.getHasPreferredTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for hasPreferredTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for hasPreferredTitle tag ");
		}
		return SKIP_BODY;
	}
}

