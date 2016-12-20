package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceAccompaniedBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceAccompaniedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceAccompaniedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FiniteResourceAccompaniedByIterator theFiniteResourceAccompaniedByIterator = (FiniteResourceAccompaniedByIterator)findAncestorWithClass(this, FiniteResourceAccompaniedByIterator.class);
			pageContext.getOut().print(theFiniteResourceAccompaniedByIterator.getAccompaniedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for accompaniedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for accompaniedBy tag ");
		}
		return SKIP_BODY;
	}
}
