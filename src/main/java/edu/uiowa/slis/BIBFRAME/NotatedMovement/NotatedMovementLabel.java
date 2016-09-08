package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			NotatedMovement theNotatedMovement = (NotatedMovement)findAncestorWithClass(this, NotatedMovement.class);
			if (!theNotatedMovement.commitNeeded) {
				pageContext.getOut().print(theNotatedMovement.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			NotatedMovement theNotatedMovement = (NotatedMovement)findAncestorWithClass(this, NotatedMovement.class);
			return theNotatedMovement.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing NotatedMovement for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			NotatedMovement theNotatedMovement = (NotatedMovement)findAncestorWithClass(this, NotatedMovement.class);
			theNotatedMovement.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for label tag ");
		}
	}
}

