package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialIsSubjectOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialIsSubjectOf currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialIsSubjectOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialIsSubjectOfIterator theSerialIsSubjectOfIterator = (SerialIsSubjectOfIterator)findAncestorWithClass(this, SerialIsSubjectOfIterator.class);
			pageContext.getOut().print(theSerialIsSubjectOfIterator.getIsSubjectOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for isSubjectOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for isSubjectOf tag ");
		}
		return SKIP_BODY;
	}
}

