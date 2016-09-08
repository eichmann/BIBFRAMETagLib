package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImagePrecedesInNarrative extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImagePrecedesInNarrative currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImagePrecedesInNarrative.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImagePrecedesInNarrativeIterator theMovingImagePrecedesInNarrativeIterator = (MovingImagePrecedesInNarrativeIterator)findAncestorWithClass(this, MovingImagePrecedesInNarrativeIterator.class);
			pageContext.getOut().print(theMovingImagePrecedesInNarrativeIterator.getPrecedesInNarrative());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for precedesInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for precedesInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

