package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageLanguage extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageLanguage currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageLanguage.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImageLanguageIterator theMovingImageLanguageIterator = (MovingImageLanguageIterator)findAncestorWithClass(this, MovingImageLanguageIterator.class);
			pageContext.getOut().print(theMovingImageLanguageIterator.getLanguage());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for language tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for language tag ");
		}
		return SKIP_BODY;
	}
}

