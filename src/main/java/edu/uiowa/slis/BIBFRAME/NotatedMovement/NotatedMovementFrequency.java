package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementFrequency extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementFrequency currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementFrequency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementFrequencyIterator theNotatedMovement = (NotatedMovementFrequencyIterator)findAncestorWithClass(this, NotatedMovementFrequencyIterator.class);
			pageContext.getOut().print(theNotatedMovement.getFrequency());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for frequency tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for frequency tag ");
		}
		return SKIP_BODY;
	}
}

