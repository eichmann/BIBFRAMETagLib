package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementLanguage extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementLanguage currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementLanguage.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementLanguageIterator theNotatedMovementLanguageIterator = (NotatedMovementLanguageIterator)findAncestorWithClass(this, NotatedMovementLanguageIterator.class);
			pageContext.getOut().print(theNotatedMovementLanguageIterator.getLanguage());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for language tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for language tag ");
		}
		return SKIP_BODY;
	}
}

