package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceIsPartOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceIsPartOf currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceIsPartOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FiniteResourceIsPartOfIterator theFiniteResourceIsPartOfIterator = (FiniteResourceIsPartOfIterator)findAncestorWithClass(this, FiniteResourceIsPartOfIterator.class);
			pageContext.getOut().print(theFiniteResourceIsPartOfIterator.getIsPartOf());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for isPartOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for isPartOf tag ");
		}
		return SKIP_BODY;
	}
}

