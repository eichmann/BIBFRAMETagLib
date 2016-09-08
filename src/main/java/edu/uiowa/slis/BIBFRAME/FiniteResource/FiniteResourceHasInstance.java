package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceHasInstance extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceHasInstance currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceHasInstance.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FiniteResourceHasInstanceIterator theFiniteResourceHasInstanceIterator = (FiniteResourceHasInstanceIterator)findAncestorWithClass(this, FiniteResourceHasInstanceIterator.class);
			pageContext.getOut().print(theFiniteResourceHasInstanceIterator.getHasInstance());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for hasInstance tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for hasInstance tag ");
		}
		return SKIP_BODY;
	}
}

