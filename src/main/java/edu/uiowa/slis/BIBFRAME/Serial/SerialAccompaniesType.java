package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialAccompaniesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialAccompaniesType currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialAccompaniesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialAccompaniesIterator theSerialAccompaniesIterator = (SerialAccompaniesIterator)findAncestorWithClass(this, SerialAccompaniesIterator.class);
			pageContext.getOut().print(theSerialAccompaniesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for accompanies tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for accompanies tag ");
		}
		return SKIP_BODY;
	}
}

