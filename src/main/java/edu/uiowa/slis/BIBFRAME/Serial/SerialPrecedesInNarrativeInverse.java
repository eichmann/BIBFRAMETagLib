package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialPrecedesInNarrativeInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialPrecedesInNarrativeInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialPrecedesInNarrativeInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialPrecedesInNarrativeInverseIterator theSerialPrecedesInNarrativeInverseIterator = (SerialPrecedesInNarrativeInverseIterator)findAncestorWithClass(this, SerialPrecedesInNarrativeInverseIterator.class);
			pageContext.getOut().print(theSerialPrecedesInNarrativeInverseIterator.getPrecedesInNarrativeInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for precedesInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for precedesInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

