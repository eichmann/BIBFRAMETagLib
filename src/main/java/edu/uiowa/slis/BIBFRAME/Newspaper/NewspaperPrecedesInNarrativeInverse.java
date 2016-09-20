package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperPrecedesInNarrativeInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperPrecedesInNarrativeInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperPrecedesInNarrativeInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperPrecedesInNarrativeInverseIterator theNewspaperPrecedesInNarrativeInverseIterator = (NewspaperPrecedesInNarrativeInverseIterator)findAncestorWithClass(this, NewspaperPrecedesInNarrativeInverseIterator.class);
			pageContext.getOut().print(theNewspaperPrecedesInNarrativeInverseIterator.getPrecedesInNarrativeInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for precedesInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for precedesInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

