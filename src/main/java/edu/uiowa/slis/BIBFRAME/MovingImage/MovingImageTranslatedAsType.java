package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageTranslatedAsType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageTranslatedAsType currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageTranslatedAsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImageTranslatedAsIterator theMovingImageTranslatedAsIterator = (MovingImageTranslatedAsIterator)findAncestorWithClass(this, MovingImageTranslatedAsIterator.class);
			pageContext.getOut().print(theMovingImageTranslatedAsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for translatedAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for translatedAs tag ");
		}
		return SKIP_BODY;
	}
}

