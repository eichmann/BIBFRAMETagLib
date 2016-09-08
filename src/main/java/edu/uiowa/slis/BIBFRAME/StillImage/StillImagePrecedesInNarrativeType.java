package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImagePrecedesInNarrativeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImagePrecedesInNarrativeType currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImagePrecedesInNarrativeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImagePrecedesInNarrativeIterator theStillImagePrecedesInNarrativeIterator = (StillImagePrecedesInNarrativeIterator)findAncestorWithClass(this, StillImagePrecedesInNarrativeIterator.class);
			pageContext.getOut().print(theStillImagePrecedesInNarrativeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for precedesInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for precedesInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

