package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperPrecedesInNarrative extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperPrecedesInNarrative currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperPrecedesInNarrative.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperPrecedesInNarrativeIterator theNewspaperPrecedesInNarrativeIterator = (NewspaperPrecedesInNarrativeIterator)findAncestorWithClass(this, NewspaperPrecedesInNarrativeIterator.class);
			pageContext.getOut().print(theNewspaperPrecedesInNarrativeIterator.getPrecedesInNarrative());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for precedesInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for precedesInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

