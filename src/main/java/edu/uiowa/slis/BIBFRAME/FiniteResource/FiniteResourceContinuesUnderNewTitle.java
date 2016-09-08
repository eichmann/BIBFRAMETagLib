package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceContinuesUnderNewTitle extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceContinuesUnderNewTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceContinuesUnderNewTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FiniteResourceContinuesUnderNewTitleIterator theFiniteResourceContinuesUnderNewTitleIterator = (FiniteResourceContinuesUnderNewTitleIterator)findAncestorWithClass(this, FiniteResourceContinuesUnderNewTitleIterator.class);
			pageContext.getOut().print(theFiniteResourceContinuesUnderNewTitleIterator.getContinuesUnderNewTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for continuesUnderNewTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for continuesUnderNewTitle tag ");
		}
		return SKIP_BODY;
	}
}

