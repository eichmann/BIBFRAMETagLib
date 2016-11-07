package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextPrecedesInNarrativeInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextPrecedesInNarrativeInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(TextPrecedesInNarrativeInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextPrecedesInNarrativeInverseIterator theTextPrecedesInNarrativeInverseIterator = (TextPrecedesInNarrativeInverseIterator)findAncestorWithClass(this, TextPrecedesInNarrativeInverseIterator.class);
			pageContext.getOut().print(theTextPrecedesInNarrativeInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for precedesInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for precedesInNarrative tag ");
		}
		return SKIP_BODY;
	}
}
