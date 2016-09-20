package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialAccompanies extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialAccompanies currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialAccompanies.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialAccompaniesIterator theSerialAccompaniesIterator = (SerialAccompaniesIterator)findAncestorWithClass(this, SerialAccompaniesIterator.class);
			pageContext.getOut().print(theSerialAccompaniesIterator.getAccompanies());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for accompanies tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for accompanies tag ");
		}
		return SKIP_BODY;
	}
}

