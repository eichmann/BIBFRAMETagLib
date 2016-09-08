package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialHasOtherEditionType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialHasOtherEditionType currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialHasOtherEditionType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialHasOtherEditionIterator theSerialHasOtherEditionIterator = (SerialHasOtherEditionIterator)findAncestorWithClass(this, SerialHasOtherEditionIterator.class);
			pageContext.getOut().print(theSerialHasOtherEditionIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for hasOtherEdition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for hasOtherEdition tag ");
		}
		return SKIP_BODY;
	}
}

