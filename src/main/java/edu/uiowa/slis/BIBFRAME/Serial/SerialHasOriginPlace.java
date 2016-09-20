package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialHasOriginPlace extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialHasOriginPlace currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialHasOriginPlace.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialHasOriginPlaceIterator theSerialHasOriginPlaceIterator = (SerialHasOriginPlaceIterator)findAncestorWithClass(this, SerialHasOriginPlaceIterator.class);
			pageContext.getOut().print(theSerialHasOriginPlaceIterator.getHasOriginPlace());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for hasOriginPlace tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for hasOriginPlace tag ");
		}
		return SKIP_BODY;
	}
}

