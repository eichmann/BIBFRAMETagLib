package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceHasSupplementType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceHasSupplementType currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceHasSupplementType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FiniteResourceHasSupplementIterator theFiniteResourceHasSupplementIterator = (FiniteResourceHasSupplementIterator)findAncestorWithClass(this, FiniteResourceHasSupplementIterator.class);
			pageContext.getOut().print(theFiniteResourceHasSupplementIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for hasSupplement tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for hasSupplement tag ");
		}
		return SKIP_BODY;
	}
}

