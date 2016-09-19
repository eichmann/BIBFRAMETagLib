package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImagePrecedesInNarrativeInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImagePrecedesInNarrativeInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImagePrecedesInNarrativeInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImagePrecedesInNarrativeInverseIterator theMovingImagePrecedesInNarrativeInverseIterator = (MovingImagePrecedesInNarrativeInverseIterator)findAncestorWithClass(this, MovingImagePrecedesInNarrativeInverseIterator.class);
			pageContext.getOut().print(theMovingImagePrecedesInNarrativeInverseIterator.getPrecedesInNarrativeInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for precedesInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for precedesInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

