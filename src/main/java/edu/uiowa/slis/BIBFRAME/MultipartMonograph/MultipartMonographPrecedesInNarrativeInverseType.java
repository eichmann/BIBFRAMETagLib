package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographPrecedesInNarrativeInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographPrecedesInNarrativeInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographPrecedesInNarrativeInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographPrecedesInNarrativeInverseIterator theMultipartMonographPrecedesInNarrativeInverseIterator = (MultipartMonographPrecedesInNarrativeInverseIterator)findAncestorWithClass(this, MultipartMonographPrecedesInNarrativeInverseIterator.class);
			pageContext.getOut().print(theMultipartMonographPrecedesInNarrativeInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for precedesInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for precedesInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

