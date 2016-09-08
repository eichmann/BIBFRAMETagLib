package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementSplitIntoType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementSplitIntoType currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementSplitIntoType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementSplitIntoIterator theNotatedMovementSplitIntoIterator = (NotatedMovementSplitIntoIterator)findAncestorWithClass(this, NotatedMovementSplitIntoIterator.class);
			pageContext.getOut().print(theNotatedMovementSplitIntoIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for splitInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for splitInto tag ");
		}
		return SKIP_BODY;
	}
}

