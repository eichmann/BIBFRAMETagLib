package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialPerformedAt extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialPerformedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialPerformedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialPerformedAtIterator theSerialPerformedAtIterator = (SerialPerformedAtIterator)findAncestorWithClass(this, SerialPerformedAtIterator.class);
			pageContext.getOut().print(theSerialPerformedAtIterator.getPerformedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for performedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for performedAt tag ");
		}
		return SKIP_BODY;
	}
}

