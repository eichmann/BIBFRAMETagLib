package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceHasOriginalVersionInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceHasOriginalVersionInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceHasOriginalVersionInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FiniteResourceHasOriginalVersionInverseIterator theFiniteResourceHasOriginalVersionInverseIterator = (FiniteResourceHasOriginalVersionInverseIterator)findAncestorWithClass(this, FiniteResourceHasOriginalVersionInverseIterator.class);
			pageContext.getOut().print(theFiniteResourceHasOriginalVersionInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for hasOriginalVersion tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for hasOriginalVersion tag ");
		}
		return SKIP_BODY;
	}
}

