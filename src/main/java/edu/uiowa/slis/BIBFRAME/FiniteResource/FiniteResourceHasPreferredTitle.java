package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceHasPreferredTitle extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceHasPreferredTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceHasPreferredTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FiniteResourceHasPreferredTitleIterator theFiniteResourceHasPreferredTitleIterator = (FiniteResourceHasPreferredTitleIterator)findAncestorWithClass(this, FiniteResourceHasPreferredTitleIterator.class);
			pageContext.getOut().print(theFiniteResourceHasPreferredTitleIterator.getHasPreferredTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for hasPreferredTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for hasPreferredTitle tag ");
		}
		return SKIP_BODY;
	}
}

