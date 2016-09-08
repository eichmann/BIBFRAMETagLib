package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaPrecedesInNarrative extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaPrecedesInNarrative currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaPrecedesInNarrative.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaPrecedesInNarrativeIterator theMultimediaPrecedesInNarrativeIterator = (MultimediaPrecedesInNarrativeIterator)findAncestorWithClass(this, MultimediaPrecedesInNarrativeIterator.class);
			pageContext.getOut().print(theMultimediaPrecedesInNarrativeIterator.getPrecedesInNarrative());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for precedesInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for precedesInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

