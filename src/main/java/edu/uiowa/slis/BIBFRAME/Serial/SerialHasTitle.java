package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialHasTitle extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialHasTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialHasTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialHasTitleIterator theSerialHasTitleIterator = (SerialHasTitleIterator)findAncestorWithClass(this, SerialHasTitleIterator.class);
			pageContext.getOut().print(theSerialHasTitleIterator.getHasTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

