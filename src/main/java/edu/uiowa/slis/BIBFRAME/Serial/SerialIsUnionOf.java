package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialIsUnionOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialIsUnionOf currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialIsUnionOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialIsUnionOfIterator theSerialIsUnionOfIterator = (SerialIsUnionOfIterator)findAncestorWithClass(this, SerialIsUnionOfIterator.class);
			pageContext.getOut().print(theSerialIsUnionOfIterator.getIsUnionOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for isUnionOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for isUnionOf tag ");
		}
		return SKIP_BODY;
	}
}

