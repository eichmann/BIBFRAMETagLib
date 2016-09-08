package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageCreatedForDegreeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageCreatedForDegreeType currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageCreatedForDegreeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImageCreatedForDegreeIterator theMovingImageCreatedForDegreeIterator = (MovingImageCreatedForDegreeIterator)findAncestorWithClass(this, MovingImageCreatedForDegreeIterator.class);
			pageContext.getOut().print(theMovingImageCreatedForDegreeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for createdForDegree tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for createdForDegree tag ");
		}
		return SKIP_BODY;
	}
}

