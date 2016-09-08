package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementHasDataSource extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementHasDataSource currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementHasDataSource.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementHasDataSourceIterator theNotatedMovementHasDataSourceIterator = (NotatedMovementHasDataSourceIterator)findAncestorWithClass(this, NotatedMovementHasDataSourceIterator.class);
			pageContext.getOut().print(theNotatedMovementHasDataSourceIterator.getHasDataSource());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for hasDataSource tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for hasDataSource tag ");
		}
		return SKIP_BODY;
	}
}

