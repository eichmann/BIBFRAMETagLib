package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialHasPreferredTitle extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialHasPreferredTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialHasPreferredTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialHasPreferredTitleIterator theSerialHasPreferredTitleIterator = (SerialHasPreferredTitleIterator)findAncestorWithClass(this, SerialHasPreferredTitleIterator.class);
			pageContext.getOut().print(theSerialHasPreferredTitleIterator.getHasPreferredTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for hasPreferredTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for hasPreferredTitle tag ");
		}
		return SKIP_BODY;
	}
}

