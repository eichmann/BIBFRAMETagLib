package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialProducedAt extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialProducedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialProducedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialProducedAtIterator theSerialProducedAtIterator = (SerialProducedAtIterator)findAncestorWithClass(this, SerialProducedAtIterator.class);
			pageContext.getOut().print(theSerialProducedAtIterator.getProducedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for producedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for producedAt tag ");
		}
		return SKIP_BODY;
	}
}

