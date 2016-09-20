package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialProducedAtType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialProducedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialProducedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialProducedAtIterator theSerialProducedAtIterator = (SerialProducedAtIterator)findAncestorWithClass(this, SerialProducedAtIterator.class);
			pageContext.getOut().print(theSerialProducedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for producedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for producedAt tag ");
		}
		return SKIP_BODY;
	}
}

