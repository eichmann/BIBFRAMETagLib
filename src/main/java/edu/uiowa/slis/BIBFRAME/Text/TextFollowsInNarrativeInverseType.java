package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextFollowsInNarrativeInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextFollowsInNarrativeInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(TextFollowsInNarrativeInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextFollowsInNarrativeInverseIterator theTextFollowsInNarrativeInverseIterator = (TextFollowsInNarrativeInverseIterator)findAncestorWithClass(this, TextFollowsInNarrativeInverseIterator.class);
			pageContext.getOut().print(theTextFollowsInNarrativeInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for followsInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for followsInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

