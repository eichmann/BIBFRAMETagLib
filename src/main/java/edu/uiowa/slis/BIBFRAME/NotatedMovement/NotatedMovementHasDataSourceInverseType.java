package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementHasDataSourceInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementHasDataSourceInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementHasDataSourceInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementHasDataSourceInverseIterator theNotatedMovementHasDataSourceInverseIterator = (NotatedMovementHasDataSourceInverseIterator)findAncestorWithClass(this, NotatedMovementHasDataSourceInverseIterator.class);
			pageContext.getOut().print(theNotatedMovementHasDataSourceInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for hasDataSource tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for hasDataSource tag ");
		}
		return SKIP_BODY;
	}
}

