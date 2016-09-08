package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceIsLastOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceIsLastOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceIsLastOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FiniteResourceIsLastOfIterator theFiniteResourceIsLastOfIterator = (FiniteResourceIsLastOfIterator)findAncestorWithClass(this, FiniteResourceIsLastOfIterator.class);
			pageContext.getOut().print(theFiniteResourceIsLastOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for isLastOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for isLastOf tag ");
		}
		return SKIP_BODY;
	}
}

