package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographFollowsInNarrativeInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographFollowsInNarrativeInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographFollowsInNarrativeInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographFollowsInNarrativeInverseIterator theMultipartMonographFollowsInNarrativeInverseIterator = (MultipartMonographFollowsInNarrativeInverseIterator)findAncestorWithClass(this, MultipartMonographFollowsInNarrativeInverseIterator.class);
			pageContext.getOut().print(theMultipartMonographFollowsInNarrativeInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for followsInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for followsInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

