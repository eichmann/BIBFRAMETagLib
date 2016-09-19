package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementDerivedFrom extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementDerivedFrom currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementDerivedFrom.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementDerivedFromIterator theNotatedMovementDerivedFromIterator = (NotatedMovementDerivedFromIterator)findAncestorWithClass(this, NotatedMovementDerivedFromIterator.class);
			pageContext.getOut().print(theNotatedMovementDerivedFromIterator.getDerivedFrom());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for derivedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for derivedFrom tag ");
		}
		return SKIP_BODY;
	}
}

