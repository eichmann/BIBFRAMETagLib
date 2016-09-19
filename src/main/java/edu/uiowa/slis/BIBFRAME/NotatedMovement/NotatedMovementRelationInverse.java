package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementRelationInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementRelationInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementRelationInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementRelationInverseIterator theNotatedMovementRelationInverseIterator = (NotatedMovementRelationInverseIterator)findAncestorWithClass(this, NotatedMovementRelationInverseIterator.class);
			pageContext.getOut().print(theNotatedMovementRelationInverseIterator.getRelationInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for relation tag ");
		}
		return SKIP_BODY;
	}
}

