package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialFollowsInNarrativeInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialFollowsInNarrativeInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialFollowsInNarrativeInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialFollowsInNarrativeInverseIterator theSerialFollowsInNarrativeInverseIterator = (SerialFollowsInNarrativeInverseIterator)findAncestorWithClass(this, SerialFollowsInNarrativeInverseIterator.class);
			pageContext.getOut().print(theSerialFollowsInNarrativeInverseIterator.getFollowsInNarrativeInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for followsInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for followsInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

