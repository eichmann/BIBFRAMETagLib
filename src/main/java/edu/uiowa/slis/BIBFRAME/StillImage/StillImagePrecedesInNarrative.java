package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImagePrecedesInNarrative extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImagePrecedesInNarrative currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImagePrecedesInNarrative.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImagePrecedesInNarrativeIterator theStillImagePrecedesInNarrativeIterator = (StillImagePrecedesInNarrativeIterator)findAncestorWithClass(this, StillImagePrecedesInNarrativeIterator.class);
			pageContext.getOut().print(theStillImagePrecedesInNarrativeIterator.getPrecedesInNarrative());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for precedesInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for precedesInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

