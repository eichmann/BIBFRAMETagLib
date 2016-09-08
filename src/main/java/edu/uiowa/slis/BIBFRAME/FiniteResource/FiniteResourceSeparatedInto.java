package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceSeparatedInto extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceSeparatedInto currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceSeparatedInto.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FiniteResourceSeparatedIntoIterator theFiniteResourceSeparatedIntoIterator = (FiniteResourceSeparatedIntoIterator)findAncestorWithClass(this, FiniteResourceSeparatedIntoIterator.class);
			pageContext.getOut().print(theFiniteResourceSeparatedIntoIterator.getSeparatedInto());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for separatedInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for separatedInto tag ");
		}
		return SKIP_BODY;
	}
}

