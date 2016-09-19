package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceHasOtherEditionInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceHasOtherEditionInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceHasOtherEditionInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FiniteResourceHasOtherEditionInverseIterator theFiniteResourceHasOtherEditionInverseIterator = (FiniteResourceHasOtherEditionInverseIterator)findAncestorWithClass(this, FiniteResourceHasOtherEditionInverseIterator.class);
			pageContext.getOut().print(theFiniteResourceHasOtherEditionInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for hasOtherEdition tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for hasOtherEdition tag ");
		}
		return SKIP_BODY;
	}
}

