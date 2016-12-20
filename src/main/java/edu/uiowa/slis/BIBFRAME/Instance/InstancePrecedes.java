package edu.uiowa.slis.BIBFRAME.Instance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstancePrecedes extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static InstancePrecedes currentInstance = null;
	private static final Log log = LogFactory.getLog(InstancePrecedes.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstancePrecedesIterator theInstancePrecedesIterator = (InstancePrecedesIterator)findAncestorWithClass(this, InstancePrecedesIterator.class);
			pageContext.getOut().print(theInstancePrecedesIterator.getPrecedes());
		} catch (Exception e) {
			log.error("Can't find enclosing Instance for precedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Instance for precedes tag ");
		}
		return SKIP_BODY;
	}
}

