package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourcePrecedesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourcePrecedesType currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourcePrecedesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourcePrecedesIterator theIntegratingResourcePrecedesIterator = (IntegratingResourcePrecedesIterator)findAncestorWithClass(this, IntegratingResourcePrecedesIterator.class);
			pageContext.getOut().print(theIntegratingResourcePrecedesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for precedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for precedes tag ");
		}
		return SKIP_BODY;
	}
}

