package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographFollowsInNarrativeInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographFollowsInNarrativeInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographFollowsInNarrativeInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographFollowsInNarrativeInverseIterator theMultipartMonographFollowsInNarrativeInverseIterator = (MultipartMonographFollowsInNarrativeInverseIterator)findAncestorWithClass(this, MultipartMonographFollowsInNarrativeInverseIterator.class);
			pageContext.getOut().print(theMultipartMonographFollowsInNarrativeInverseIterator.getFollowsInNarrativeInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for followsInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for followsInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

