package edu.uiowa.slis.BIBFRAME.RWO;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RWOPrecedes extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static RWOPrecedes currentInstance = null;
	private static final Log log = LogFactory.getLog(RWOPrecedes.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RWOPrecedesIterator theRWOPrecedesIterator = (RWOPrecedesIterator)findAncestorWithClass(this, RWOPrecedesIterator.class);
			pageContext.getOut().print(theRWOPrecedesIterator.getPrecedes());
		} catch (Exception e) {
			log.error("Can't find enclosing RWO for precedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing RWO for precedes tag ");
		}
		return SKIP_BODY;
	}
}

