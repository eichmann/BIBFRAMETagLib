package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialContinuedUnderNewTitleBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialContinuedUnderNewTitleBy currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialContinuedUnderNewTitleBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialContinuedUnderNewTitleByIterator theSerialContinuedUnderNewTitleByIterator = (SerialContinuedUnderNewTitleByIterator)findAncestorWithClass(this, SerialContinuedUnderNewTitleByIterator.class);
			pageContext.getOut().print(theSerialContinuedUnderNewTitleByIterator.getContinuedUnderNewTitleBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for continuedUnderNewTitleBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for continuedUnderNewTitleBy tag ");
		}
		return SKIP_BODY;
	}
}

