package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementSeparatedFrom extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementSeparatedFrom currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementSeparatedFrom.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementSeparatedFromIterator theNotatedMovementSeparatedFromIterator = (NotatedMovementSeparatedFromIterator)findAncestorWithClass(this, NotatedMovementSeparatedFromIterator.class);
			pageContext.getOut().print(theNotatedMovementSeparatedFromIterator.getSeparatedFrom());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for separatedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for separatedFrom tag ");
		}
		return SKIP_BODY;
	}
}

