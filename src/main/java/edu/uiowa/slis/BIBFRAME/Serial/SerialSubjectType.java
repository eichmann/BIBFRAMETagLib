package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialSubjectType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialSubjectType currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialSubjectType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialSubjectIterator theSerialSubjectIterator = (SerialSubjectIterator)findAncestorWithClass(this, SerialSubjectIterator.class);
			pageContext.getOut().print(theSerialSubjectIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for subject tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for subject tag ");
		}
		return SKIP_BODY;
	}
}

