package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementProducedAt extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementProducedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementProducedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementProducedAtIterator theNotatedMovementProducedAtIterator = (NotatedMovementProducedAtIterator)findAncestorWithClass(this, NotatedMovementProducedAtIterator.class);
			pageContext.getOut().print(theNotatedMovementProducedAtIterator.getProducedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for producedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for producedAt tag ");
		}
		return SKIP_BODY;
	}
}

