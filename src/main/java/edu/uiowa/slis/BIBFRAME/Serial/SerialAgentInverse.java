package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialAgentInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialAgentInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialAgentInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialAgentInverseIterator theSerialAgentInverseIterator = (SerialAgentInverseIterator)findAncestorWithClass(this, SerialAgentInverseIterator.class);
			pageContext.getOut().print(theSerialAgentInverseIterator.getAgentInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for agent tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for agent tag ");
		}
		return SKIP_BODY;
	}
}

