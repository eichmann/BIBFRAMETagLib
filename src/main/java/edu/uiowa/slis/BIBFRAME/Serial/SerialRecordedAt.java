package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialRecordedAt extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialRecordedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialRecordedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialRecordedAtIterator theSerialRecordedAtIterator = (SerialRecordedAtIterator)findAncestorWithClass(this, SerialRecordedAtIterator.class);
			pageContext.getOut().print(theSerialRecordedAtIterator.getRecordedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for recordedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for recordedAt tag ");
		}
		return SKIP_BODY;
	}
}

