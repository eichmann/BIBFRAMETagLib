package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialDerivedFrom extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialDerivedFrom currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialDerivedFrom.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialDerivedFromIterator theSerialDerivedFromIterator = (SerialDerivedFromIterator)findAncestorWithClass(this, SerialDerivedFromIterator.class);
			pageContext.getOut().print(theSerialDerivedFromIterator.getDerivedFrom());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for derivedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for derivedFrom tag ");
		}
		return SKIP_BODY;
	}
}

