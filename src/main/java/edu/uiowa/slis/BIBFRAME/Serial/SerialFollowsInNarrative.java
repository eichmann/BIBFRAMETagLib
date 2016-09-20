package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialFollowsInNarrative extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialFollowsInNarrative currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialFollowsInNarrative.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialFollowsInNarrativeIterator theSerialFollowsInNarrativeIterator = (SerialFollowsInNarrativeIterator)findAncestorWithClass(this, SerialFollowsInNarrativeIterator.class);
			pageContext.getOut().print(theSerialFollowsInNarrativeIterator.getFollowsInNarrative());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for followsInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for followsInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

