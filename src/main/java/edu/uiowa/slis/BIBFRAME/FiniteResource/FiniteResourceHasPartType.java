package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceHasPartType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceHasPartType currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceHasPartType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FiniteResourceHasPartIterator theFiniteResourceHasPartIterator = (FiniteResourceHasPartIterator)findAncestorWithClass(this, FiniteResourceHasPartIterator.class);
			pageContext.getOut().print(theFiniteResourceHasPartIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for hasPart tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for hasPart tag ");
		}
		return SKIP_BODY;
	}
}

