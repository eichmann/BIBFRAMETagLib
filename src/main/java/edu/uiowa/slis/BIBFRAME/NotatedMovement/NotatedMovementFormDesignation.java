package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementFormDesignation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementFormDesignation currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementFormDesignation.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementFormDesignationIterator theNotatedMovement = (NotatedMovementFormDesignationIterator)findAncestorWithClass(this, NotatedMovementFormDesignationIterator.class);
			pageContext.getOut().print(theNotatedMovement.getFormDesignation());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for formDesignation tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for formDesignation tag ");
		}
		return SKIP_BODY;
	}
}

