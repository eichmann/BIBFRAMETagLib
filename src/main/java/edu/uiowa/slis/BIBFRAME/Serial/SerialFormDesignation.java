package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialFormDesignation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialFormDesignation currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialFormDesignation.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SerialFormDesignationIterator theSerial = (SerialFormDesignationIterator)findAncestorWithClass(this, SerialFormDesignationIterator.class);
			pageContext.getOut().print(theSerial.getFormDesignation());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for formDesignation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for formDesignation tag ");
		}
		return SKIP_BODY;
	}
}

