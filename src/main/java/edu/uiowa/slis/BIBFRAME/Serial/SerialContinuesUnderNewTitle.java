package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialContinuesUnderNewTitle extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialContinuesUnderNewTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialContinuesUnderNewTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialContinuesUnderNewTitleIterator theSerialContinuesUnderNewTitleIterator = (SerialContinuesUnderNewTitleIterator)findAncestorWithClass(this, SerialContinuesUnderNewTitleIterator.class);
			pageContext.getOut().print(theSerialContinuesUnderNewTitleIterator.getContinuesUnderNewTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for continuesUnderNewTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for continuesUnderNewTitle tag ");
		}
		return SKIP_BODY;
	}
}

