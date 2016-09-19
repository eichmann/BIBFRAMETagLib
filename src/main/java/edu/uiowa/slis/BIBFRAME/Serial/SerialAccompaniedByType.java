package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialAccompaniedByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialAccompaniedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialAccompaniedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialAccompaniedByIterator theSerialAccompaniedByIterator = (SerialAccompaniedByIterator)findAncestorWithClass(this, SerialAccompaniedByIterator.class);
			pageContext.getOut().print(theSerialAccompaniedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for accompaniedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for accompaniedBy tag ");
		}
		return SKIP_BODY;
	}
}

