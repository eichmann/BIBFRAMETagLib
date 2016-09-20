package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialFrequency extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialFrequency currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialFrequency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SerialFrequencyIterator theSerial = (SerialFrequencyIterator)findAncestorWithClass(this, SerialFrequencyIterator.class);
			pageContext.getOut().print(theSerial.getFrequency());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for frequency tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for frequency tag ");
		}
		return SKIP_BODY;
	}
}

