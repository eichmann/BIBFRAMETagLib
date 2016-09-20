package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialFollowsInNarrativeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialFollowsInNarrativeType currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialFollowsInNarrativeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialFollowsInNarrativeIterator theSerialFollowsInNarrativeIterator = (SerialFollowsInNarrativeIterator)findAncestorWithClass(this, SerialFollowsInNarrativeIterator.class);
			pageContext.getOut().print(theSerialFollowsInNarrativeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for followsInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for followsInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

