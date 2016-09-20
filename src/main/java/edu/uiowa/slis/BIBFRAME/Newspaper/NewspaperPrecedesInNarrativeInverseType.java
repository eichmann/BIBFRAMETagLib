package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperPrecedesInNarrativeInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperPrecedesInNarrativeInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperPrecedesInNarrativeInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperPrecedesInNarrativeInverseIterator theNewspaperPrecedesInNarrativeInverseIterator = (NewspaperPrecedesInNarrativeInverseIterator)findAncestorWithClass(this, NewspaperPrecedesInNarrativeInverseIterator.class);
			pageContext.getOut().print(theNewspaperPrecedesInNarrativeInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for precedesInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for precedesInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

