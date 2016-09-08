package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaPrecedesInNarrativeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaPrecedesInNarrativeType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaPrecedesInNarrativeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaPrecedesInNarrativeIterator theMultimediaPrecedesInNarrativeIterator = (MultimediaPrecedesInNarrativeIterator)findAncestorWithClass(this, MultimediaPrecedesInNarrativeIterator.class);
			pageContext.getOut().print(theMultimediaPrecedesInNarrativeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for precedesInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for precedesInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

