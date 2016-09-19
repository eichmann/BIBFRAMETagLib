package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImagePrecedesInNarrativeInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImagePrecedesInNarrativeInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImagePrecedesInNarrativeInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImagePrecedesInNarrativeInverseIterator theStillImagePrecedesInNarrativeInverseIterator = (StillImagePrecedesInNarrativeInverseIterator)findAncestorWithClass(this, StillImagePrecedesInNarrativeInverseIterator.class);
			pageContext.getOut().print(theStillImagePrecedesInNarrativeInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for precedesInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for precedesInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

