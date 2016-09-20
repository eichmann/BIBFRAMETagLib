package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialHasOriginPlaceType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialHasOriginPlaceType currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialHasOriginPlaceType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialHasOriginPlaceIterator theSerialHasOriginPlaceIterator = (SerialHasOriginPlaceIterator)findAncestorWithClass(this, SerialHasOriginPlaceIterator.class);
			pageContext.getOut().print(theSerialHasOriginPlaceIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for hasOriginPlace tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for hasOriginPlace tag ");
		}
		return SKIP_BODY;
	}
}

