package edu.uiowa.slis.BIBFRAME.Instance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstanceName extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static InstanceName currentInstance = null;
	private static final Log log = LogFactory.getLog(InstanceName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			InstanceNameIterator theInstance = (InstanceNameIterator)findAncestorWithClass(this, InstanceNameIterator.class);
			pageContext.getOut().print(theInstance.getName());
		} catch (Exception e) {
			log.error("Can't find enclosing Instance for name tag ", e);
			throw new JspTagException("Error: Can't find enclosing Instance for name tag ");
		}
		return SKIP_BODY;
	}
}

