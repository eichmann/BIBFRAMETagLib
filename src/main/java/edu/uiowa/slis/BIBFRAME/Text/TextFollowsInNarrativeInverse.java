package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextFollowsInNarrativeInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextFollowsInNarrativeInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(TextFollowsInNarrativeInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextFollowsInNarrativeInverseIterator theTextFollowsInNarrativeInverseIterator = (TextFollowsInNarrativeInverseIterator)findAncestorWithClass(this, TextFollowsInNarrativeInverseIterator.class);
			pageContext.getOut().print(theTextFollowsInNarrativeInverseIterator.getFollowsInNarrativeInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for followsInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for followsInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

