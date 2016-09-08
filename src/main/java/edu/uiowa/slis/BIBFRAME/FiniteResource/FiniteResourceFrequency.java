package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceFrequency extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceFrequency currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceFrequency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FiniteResourceFrequencyIterator theFiniteResource = (FiniteResourceFrequencyIterator)findAncestorWithClass(this, FiniteResourceFrequencyIterator.class);
			pageContext.getOut().print(theFiniteResource.getFrequency());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for frequency tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for frequency tag ");
		}
		return SKIP_BODY;
	}
}

