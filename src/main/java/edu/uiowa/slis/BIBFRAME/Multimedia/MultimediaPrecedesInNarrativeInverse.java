package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaPrecedesInNarrativeInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaPrecedesInNarrativeInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaPrecedesInNarrativeInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaPrecedesInNarrativeInverseIterator theMultimediaPrecedesInNarrativeInverseIterator = (MultimediaPrecedesInNarrativeInverseIterator)findAncestorWithClass(this, MultimediaPrecedesInNarrativeInverseIterator.class);
			pageContext.getOut().print(theMultimediaPrecedesInNarrativeInverseIterator.getPrecedesInNarrativeInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for precedesInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for precedesInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

