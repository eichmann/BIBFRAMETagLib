package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceSeparatedFromType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceSeparatedFromType currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceSeparatedFromType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FiniteResourceSeparatedFromIterator theFiniteResourceSeparatedFromIterator = (FiniteResourceSeparatedFromIterator)findAncestorWithClass(this, FiniteResourceSeparatedFromIterator.class);
			pageContext.getOut().print(theFiniteResourceSeparatedFromIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for separatedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for separatedFrom tag ");
		}
		return SKIP_BODY;
	}
}

