package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceHasOtherEditionType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceHasOtherEditionType currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceHasOtherEditionType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FiniteResourceHasOtherEditionIterator theFiniteResourceHasOtherEditionIterator = (FiniteResourceHasOtherEditionIterator)findAncestorWithClass(this, FiniteResourceHasOtherEditionIterator.class);
			pageContext.getOut().print(theFiniteResourceHasOtherEditionIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for hasOtherEdition tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for hasOtherEdition tag ");
		}
		return SKIP_BODY;
	}
}

