package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialHasFindingAidType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialHasFindingAidType currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialHasFindingAidType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialHasFindingAidIterator theSerialHasFindingAidIterator = (SerialHasFindingAidIterator)findAncestorWithClass(this, SerialHasFindingAidIterator.class);
			pageContext.getOut().print(theSerialHasFindingAidIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for hasFindingAid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for hasFindingAid tag ");
		}
		return SKIP_BODY;
	}
}
