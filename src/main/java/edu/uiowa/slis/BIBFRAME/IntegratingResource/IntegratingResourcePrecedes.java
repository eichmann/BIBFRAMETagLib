package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourcePrecedes extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourcePrecedes currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourcePrecedes.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourcePrecedesIterator theIntegratingResourcePrecedesIterator = (IntegratingResourcePrecedesIterator)findAncestorWithClass(this, IntegratingResourcePrecedesIterator.class);
			pageContext.getOut().print(theIntegratingResourcePrecedesIterator.getPrecedes());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for precedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for precedes tag ");
		}
		return SKIP_BODY;
	}
}

