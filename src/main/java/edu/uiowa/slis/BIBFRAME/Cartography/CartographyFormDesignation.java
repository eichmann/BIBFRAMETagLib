package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyFormDesignation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyFormDesignation currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyFormDesignation.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CartographyFormDesignationIterator theCartography = (CartographyFormDesignationIterator)findAncestorWithClass(this, CartographyFormDesignationIterator.class);
			pageContext.getOut().print(theCartography.getFormDesignation());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for formDesignation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for formDesignation tag ");
		}
		return SKIP_BODY;
	}
}

