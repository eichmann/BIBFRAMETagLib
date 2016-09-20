package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationPrecedes extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationPrecedes currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationPrecedes.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DissertationPrecedesIterator theDissertationPrecedesIterator = (DissertationPrecedesIterator)findAncestorWithClass(this, DissertationPrecedesIterator.class);
			pageContext.getOut().print(theDissertationPrecedesIterator.getPrecedes());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for precedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for precedes tag ");
		}
		return SKIP_BODY;
	}
}

