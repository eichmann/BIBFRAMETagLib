package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceTranslatesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceTranslatesType currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceTranslatesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FiniteResourceTranslatesIterator theFiniteResourceTranslatesIterator = (FiniteResourceTranslatesIterator)findAncestorWithClass(this, FiniteResourceTranslatesIterator.class);
			pageContext.getOut().print(theFiniteResourceTranslatesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for translates tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for translates tag ");
		}
		return SKIP_BODY;
	}
}

