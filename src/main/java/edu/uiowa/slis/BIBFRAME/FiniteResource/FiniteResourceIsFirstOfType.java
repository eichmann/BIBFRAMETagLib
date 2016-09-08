package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceIsFirstOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceIsFirstOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceIsFirstOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FiniteResourceIsFirstOfIterator theFiniteResourceIsFirstOfIterator = (FiniteResourceIsFirstOfIterator)findAncestorWithClass(this, FiniteResourceIsFirstOfIterator.class);
			pageContext.getOut().print(theFiniteResourceIsFirstOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for isFirstOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for isFirstOf tag ");
		}
		return SKIP_BODY;
	}
}

