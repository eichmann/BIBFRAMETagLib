package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographFollowsInNarrativeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographFollowsInNarrativeType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographFollowsInNarrativeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographFollowsInNarrativeIterator theMultipartMonographFollowsInNarrativeIterator = (MultipartMonographFollowsInNarrativeIterator)findAncestorWithClass(this, MultipartMonographFollowsInNarrativeIterator.class);
			pageContext.getOut().print(theMultipartMonographFollowsInNarrativeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for followsInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for followsInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

