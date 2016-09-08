package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialRecordedAtType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialRecordedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialRecordedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialRecordedAtIterator theSerialRecordedAtIterator = (SerialRecordedAtIterator)findAncestorWithClass(this, SerialRecordedAtIterator.class);
			pageContext.getOut().print(theSerialRecordedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for recordedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for recordedAt tag ");
		}
		return SKIP_BODY;
	}
}

