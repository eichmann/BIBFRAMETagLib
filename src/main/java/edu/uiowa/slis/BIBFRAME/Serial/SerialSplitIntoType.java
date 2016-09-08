package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialSplitIntoType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialSplitIntoType currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialSplitIntoType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialSplitIntoIterator theSerialSplitIntoIterator = (SerialSplitIntoIterator)findAncestorWithClass(this, SerialSplitIntoIterator.class);
			pageContext.getOut().print(theSerialSplitIntoIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for splitInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for splitInto tag ");
		}
		return SKIP_BODY;
	}
}

