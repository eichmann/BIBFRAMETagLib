package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextPrecedesInNarrative extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextPrecedesInNarrative currentInstance = null;
	private static final Log log = LogFactory.getLog(TextPrecedesInNarrative.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextPrecedesInNarrativeIterator theTextPrecedesInNarrativeIterator = (TextPrecedesInNarrativeIterator)findAncestorWithClass(this, TextPrecedesInNarrativeIterator.class);
			pageContext.getOut().print(theTextPrecedesInNarrativeIterator.getPrecedesInNarrative());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for precedesInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for precedesInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

