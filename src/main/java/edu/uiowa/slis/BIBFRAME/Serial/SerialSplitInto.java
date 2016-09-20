package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialSplitInto extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialSplitInto currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialSplitInto.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialSplitIntoIterator theSerialSplitIntoIterator = (SerialSplitIntoIterator)findAncestorWithClass(this, SerialSplitIntoIterator.class);
			pageContext.getOut().print(theSerialSplitIntoIterator.getSplitInto());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for splitInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for splitInto tag ");
		}
		return SKIP_BODY;
	}
}

