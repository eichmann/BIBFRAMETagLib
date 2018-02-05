package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceName extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceName currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FiniteResourceNameIterator theFiniteResource = (FiniteResourceNameIterator)findAncestorWithClass(this, FiniteResourceNameIterator.class);
			pageContext.getOut().print(theFiniteResource.getName());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for name tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for name tag ");
		}
		return SKIP_BODY;
	}
}

