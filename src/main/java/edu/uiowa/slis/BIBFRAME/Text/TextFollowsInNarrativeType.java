package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextFollowsInNarrativeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextFollowsInNarrativeType currentInstance = null;
	private static final Log log = LogFactory.getLog(TextFollowsInNarrativeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextFollowsInNarrativeIterator theTextFollowsInNarrativeIterator = (TextFollowsInNarrativeIterator)findAncestorWithClass(this, TextFollowsInNarrativeIterator.class);
			pageContext.getOut().print(theTextFollowsInNarrativeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for followsInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for followsInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

