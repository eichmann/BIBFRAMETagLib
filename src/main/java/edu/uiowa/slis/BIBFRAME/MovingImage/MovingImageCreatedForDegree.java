package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageCreatedForDegree extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageCreatedForDegree currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageCreatedForDegree.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImageCreatedForDegreeIterator theMovingImageCreatedForDegreeIterator = (MovingImageCreatedForDegreeIterator)findAncestorWithClass(this, MovingImageCreatedForDegreeIterator.class);
			pageContext.getOut().print(theMovingImageCreatedForDegreeIterator.getCreatedForDegree());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for createdForDegree tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for createdForDegree tag ");
		}
		return SKIP_BODY;
	}
}

