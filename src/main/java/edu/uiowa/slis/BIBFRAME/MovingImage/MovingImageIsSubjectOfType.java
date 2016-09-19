package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageIsSubjectOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageIsSubjectOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageIsSubjectOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImageIsSubjectOfIterator theMovingImageIsSubjectOfIterator = (MovingImageIsSubjectOfIterator)findAncestorWithClass(this, MovingImageIsSubjectOfIterator.class);
			pageContext.getOut().print(theMovingImageIsSubjectOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for isSubjectOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for isSubjectOf tag ");
		}
		return SKIP_BODY;
	}
}

