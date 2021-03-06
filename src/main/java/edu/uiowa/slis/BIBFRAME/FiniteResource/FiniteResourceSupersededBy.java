package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceSupersededBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceSupersededBy currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceSupersededBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FiniteResourceSupersededByIterator theFiniteResourceSupersededByIterator = (FiniteResourceSupersededByIterator)findAncestorWithClass(this, FiniteResourceSupersededByIterator.class);
			pageContext.getOut().print(theFiniteResourceSupersededByIterator.getSupersededBy());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for supersededBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for supersededBy tag ");
		}
		return SKIP_BODY;
	}
}

