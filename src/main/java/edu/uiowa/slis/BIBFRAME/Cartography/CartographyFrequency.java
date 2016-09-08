package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyFrequency extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyFrequency currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyFrequency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CartographyFrequencyIterator theCartography = (CartographyFrequencyIterator)findAncestorWithClass(this, CartographyFrequencyIterator.class);
			pageContext.getOut().print(theCartography.getFrequency());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for frequency tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for frequency tag ");
		}
		return SKIP_BODY;
	}
}

