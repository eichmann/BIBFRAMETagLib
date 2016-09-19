package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourcePrecedes extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourcePrecedes currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourcePrecedes.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FiniteResourcePrecedesIterator theFiniteResourcePrecedesIterator = (FiniteResourcePrecedesIterator)findAncestorWithClass(this, FiniteResourcePrecedesIterator.class);
			pageContext.getOut().print(theFiniteResourcePrecedesIterator.getPrecedes());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for precedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for precedes tag ");
		}
		return SKIP_BODY;
	}
}

