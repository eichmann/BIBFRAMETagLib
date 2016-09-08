package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementTranslatedAs extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementTranslatedAs currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementTranslatedAs.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementTranslatedAsIterator theNotatedMovementTranslatedAsIterator = (NotatedMovementTranslatedAsIterator)findAncestorWithClass(this, NotatedMovementTranslatedAsIterator.class);
			pageContext.getOut().print(theNotatedMovementTranslatedAsIterator.getTranslatedAs());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for translatedAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for translatedAs tag ");
		}
		return SKIP_BODY;
	}
}

