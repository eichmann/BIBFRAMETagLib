package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageTranslatedAsType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageTranslatedAsType currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageTranslatedAsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImageTranslatedAsIterator theStillImageTranslatedAsIterator = (StillImageTranslatedAsIterator)findAncestorWithClass(this, StillImageTranslatedAsIterator.class);
			pageContext.getOut().print(theStillImageTranslatedAsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for translatedAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for translatedAs tag ");
		}
		return SKIP_BODY;
	}
}

