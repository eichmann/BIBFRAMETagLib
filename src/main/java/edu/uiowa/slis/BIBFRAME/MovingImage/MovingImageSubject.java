package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageSubject extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageSubject currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageSubject.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImageSubjectIterator theMovingImageSubjectIterator = (MovingImageSubjectIterator)findAncestorWithClass(this, MovingImageSubjectIterator.class);
			pageContext.getOut().print(theMovingImageSubjectIterator.getSubject());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for subject tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for subject tag ");
		}
		return SKIP_BODY;
	}
}

