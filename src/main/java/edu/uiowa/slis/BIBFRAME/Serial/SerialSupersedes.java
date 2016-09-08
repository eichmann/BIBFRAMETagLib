package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialSupersedes extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialSupersedes currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialSupersedes.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialSupersedesIterator theSerialSupersedesIterator = (SerialSupersedesIterator)findAncestorWithClass(this, SerialSupersedesIterator.class);
			pageContext.getOut().print(theSerialSupersedesIterator.getSupersedes());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for supersedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for supersedes tag ");
		}
		return SKIP_BODY;
	}
}

