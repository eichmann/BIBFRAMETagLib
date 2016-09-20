package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialHasOtherEditionInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialHasOtherEditionInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialHasOtherEditionInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialHasOtherEditionInverseIterator theSerialHasOtherEditionInverseIterator = (SerialHasOtherEditionInverseIterator)findAncestorWithClass(this, SerialHasOtherEditionInverseIterator.class);
			pageContext.getOut().print(theSerialHasOtherEditionInverseIterator.getHasOtherEditionInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for hasOtherEdition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for hasOtherEdition tag ");
		}
		return SKIP_BODY;
	}
}

