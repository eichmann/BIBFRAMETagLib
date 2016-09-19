package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementAccompanies extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementAccompanies currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementAccompanies.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementAccompaniesIterator theNotatedMovementAccompaniesIterator = (NotatedMovementAccompaniesIterator)findAncestorWithClass(this, NotatedMovementAccompaniesIterator.class);
			pageContext.getOut().print(theNotatedMovementAccompaniesIterator.getAccompanies());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for accompanies tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for accompanies tag ");
		}
		return SKIP_BODY;
	}
}

