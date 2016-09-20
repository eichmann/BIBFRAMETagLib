package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialIsFindingAidForType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialIsFindingAidForType currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialIsFindingAidForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialIsFindingAidForIterator theSerialIsFindingAidForIterator = (SerialIsFindingAidForIterator)findAncestorWithClass(this, SerialIsFindingAidForIterator.class);
			pageContext.getOut().print(theSerialIsFindingAidForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for isFindingAidFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for isFindingAidFor tag ");
		}
		return SKIP_BODY;
	}
}

