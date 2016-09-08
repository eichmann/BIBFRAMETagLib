package edu.uiowa.slis.BIBFRAME.Instance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstanceColorContent extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static InstanceColorContent currentInstance = null;
	private static final Log log = LogFactory.getLog(InstanceColorContent.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			InstanceColorContentIterator theInstance = (InstanceColorContentIterator)findAncestorWithClass(this, InstanceColorContentIterator.class);
			pageContext.getOut().print(theInstance.getColorContent());
		} catch (Exception e) {
			log.error("Can't find enclosing Instance for colorContent tag ", e);
			throw new JspTagException("Error: Can't find enclosing Instance for colorContent tag ");
		}
		return SKIP_BODY;
	}
}

