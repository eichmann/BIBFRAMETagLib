package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialIdentifiedByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialIdentifiedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialIdentifiedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialIdentifiedByIterator theSerialIdentifiedByIterator = (SerialIdentifiedByIterator)findAncestorWithClass(this, SerialIdentifiedByIterator.class);
			pageContext.getOut().print(theSerialIdentifiedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for identifiedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for identifiedBy tag ");
		}
		return SKIP_BODY;
	}
}

