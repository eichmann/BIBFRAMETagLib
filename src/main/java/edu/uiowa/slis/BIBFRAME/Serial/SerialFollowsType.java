package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialFollowsType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialFollowsType currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialFollowsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialFollowsIterator theSerialFollowsIterator = (SerialFollowsIterator)findAncestorWithClass(this, SerialFollowsIterator.class);
			pageContext.getOut().print(theSerialFollowsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for follows tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for follows tag ");
		}
		return SKIP_BODY;
	}
}

