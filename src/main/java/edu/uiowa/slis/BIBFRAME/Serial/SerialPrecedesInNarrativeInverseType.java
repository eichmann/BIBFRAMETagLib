package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialPrecedesInNarrativeInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialPrecedesInNarrativeInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialPrecedesInNarrativeInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialPrecedesInNarrativeInverseIterator theSerialPrecedesInNarrativeInverseIterator = (SerialPrecedesInNarrativeInverseIterator)findAncestorWithClass(this, SerialPrecedesInNarrativeInverseIterator.class);
			pageContext.getOut().print(theSerialPrecedesInNarrativeInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for precedesInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for precedesInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

