package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceContinuedUnderNewTitleBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceContinuedUnderNewTitleBy currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceContinuedUnderNewTitleBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FiniteResourceContinuedUnderNewTitleByIterator theFiniteResourceContinuedUnderNewTitleByIterator = (FiniteResourceContinuedUnderNewTitleByIterator)findAncestorWithClass(this, FiniteResourceContinuedUnderNewTitleByIterator.class);
			pageContext.getOut().print(theFiniteResourceContinuedUnderNewTitleByIterator.getContinuedUnderNewTitleBy());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for continuedUnderNewTitleBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for continuedUnderNewTitleBy tag ");
		}
		return SKIP_BODY;
	}
}

