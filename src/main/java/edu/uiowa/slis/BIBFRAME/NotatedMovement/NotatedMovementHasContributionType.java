package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementHasContributionType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementHasContributionType currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementHasContributionType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementHasContributionIterator theNotatedMovementHasContributionIterator = (NotatedMovementHasContributionIterator)findAncestorWithClass(this, NotatedMovementHasContributionIterator.class);
			pageContext.getOut().print(theNotatedMovementHasContributionIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for hasContribution tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for hasContribution tag ");
		}
		return SKIP_BODY;
	}
}

