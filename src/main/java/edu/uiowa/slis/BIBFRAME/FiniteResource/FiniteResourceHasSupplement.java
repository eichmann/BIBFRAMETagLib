package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceHasSupplement extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceHasSupplement currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceHasSupplement.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FiniteResourceHasSupplementIterator theFiniteResourceHasSupplementIterator = (FiniteResourceHasSupplementIterator)findAncestorWithClass(this, FiniteResourceHasSupplementIterator.class);
			pageContext.getOut().print(theFiniteResourceHasSupplementIterator.getHasSupplement());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for hasSupplement tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for hasSupplement tag ");
		}
		return SKIP_BODY;
	}
}

