package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageLanguageType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageLanguageType currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageLanguageType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImageLanguageIterator theMovingImageLanguageIterator = (MovingImageLanguageIterator)findAncestorWithClass(this, MovingImageLanguageIterator.class);
			pageContext.getOut().print(theMovingImageLanguageIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for language tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for language tag ");
		}
		return SKIP_BODY;
	}
}

