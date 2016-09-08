package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceHasPart extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceHasPart currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceHasPart.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FiniteResourceHasPartIterator theFiniteResourceHasPartIterator = (FiniteResourceHasPartIterator)findAncestorWithClass(this, FiniteResourceHasPartIterator.class);
			pageContext.getOut().print(theFiniteResourceHasPartIterator.getHasPart());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for hasPart tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for hasPart tag ");
		}
		return SKIP_BODY;
	}
}

