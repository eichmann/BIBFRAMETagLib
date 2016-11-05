package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceIdentifiedBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceIdentifiedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceIdentifiedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FiniteResourceIdentifiedByIterator theFiniteResourceIdentifiedByIterator = (FiniteResourceIdentifiedByIterator)findAncestorWithClass(this, FiniteResourceIdentifiedByIterator.class);
			pageContext.getOut().print(theFiniteResourceIdentifiedByIterator.getIdentifiedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for identifiedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for identifiedBy tag ");
		}
		return SKIP_BODY;
	}
}

