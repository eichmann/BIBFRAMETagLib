package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementRelation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementRelation currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementRelation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementRelationIterator theNotatedMovementRelationIterator = (NotatedMovementRelationIterator)findAncestorWithClass(this, NotatedMovementRelationIterator.class);
			pageContext.getOut().print(theNotatedMovementRelationIterator.getRelation());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for relation tag ");
		}
		return SKIP_BODY;
	}
}

