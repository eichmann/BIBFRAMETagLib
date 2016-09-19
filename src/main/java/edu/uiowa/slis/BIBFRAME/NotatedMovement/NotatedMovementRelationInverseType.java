package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementRelationInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementRelationInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementRelationInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementRelationInverseIterator theNotatedMovementRelationInverseIterator = (NotatedMovementRelationInverseIterator)findAncestorWithClass(this, NotatedMovementRelationInverseIterator.class);
			pageContext.getOut().print(theNotatedMovementRelationInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for relation tag ");
		}
		return SKIP_BODY;
	}
}

