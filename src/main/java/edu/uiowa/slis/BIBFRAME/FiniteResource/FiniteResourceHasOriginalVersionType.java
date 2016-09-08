package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceHasOriginalVersionType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceHasOriginalVersionType currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceHasOriginalVersionType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FiniteResourceHasOriginalVersionIterator theFiniteResourceHasOriginalVersionIterator = (FiniteResourceHasOriginalVersionIterator)findAncestorWithClass(this, FiniteResourceHasOriginalVersionIterator.class);
			pageContext.getOut().print(theFiniteResourceHasOriginalVersionIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for hasOriginalVersion tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for hasOriginalVersion tag ");
		}
		return SKIP_BODY;
	}
}

