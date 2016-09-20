package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographPrecedesInNarrativeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographPrecedesInNarrativeType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographPrecedesInNarrativeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographPrecedesInNarrativeIterator theMultipartMonographPrecedesInNarrativeIterator = (MultipartMonographPrecedesInNarrativeIterator)findAncestorWithClass(this, MultipartMonographPrecedesInNarrativeIterator.class);
			pageContext.getOut().print(theMultipartMonographPrecedesInNarrativeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for precedesInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for precedesInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

