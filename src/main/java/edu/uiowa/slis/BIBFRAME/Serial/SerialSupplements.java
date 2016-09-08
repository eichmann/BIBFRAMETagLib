package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialSupplements extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialSupplements currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialSupplements.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialSupplementsIterator theSerialSupplementsIterator = (SerialSupplementsIterator)findAncestorWithClass(this, SerialSupplementsIterator.class);
			pageContext.getOut().print(theSerialSupplementsIterator.getSupplements());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for supplements tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for supplements tag ");
		}
		return SKIP_BODY;
	}
}

