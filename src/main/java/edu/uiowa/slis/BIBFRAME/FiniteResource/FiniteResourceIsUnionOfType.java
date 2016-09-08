package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceIsUnionOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceIsUnionOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceIsUnionOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FiniteResourceIsUnionOfIterator theFiniteResourceIsUnionOfIterator = (FiniteResourceIsUnionOfIterator)findAncestorWithClass(this, FiniteResourceIsUnionOfIterator.class);
			pageContext.getOut().print(theFiniteResourceIsUnionOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for isUnionOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for isUnionOf tag ");
		}
		return SKIP_BODY;
	}
}

