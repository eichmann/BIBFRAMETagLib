package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceHasTitle extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceHasTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceHasTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FiniteResourceHasTitleIterator theFiniteResourceHasTitleIterator = (FiniteResourceHasTitleIterator)findAncestorWithClass(this, FiniteResourceHasTitleIterator.class);
			pageContext.getOut().print(theFiniteResourceHasTitleIterator.getHasTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

