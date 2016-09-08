package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageSubjectType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageSubjectType currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageSubjectType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImageSubjectIterator theMovingImageSubjectIterator = (MovingImageSubjectIterator)findAncestorWithClass(this, MovingImageSubjectIterator.class);
			pageContext.getOut().print(theMovingImageSubjectIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for subject tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for subject tag ");
		}
		return SKIP_BODY;
	}
}

