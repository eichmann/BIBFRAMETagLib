package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyHasFindingAid extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyHasFindingAid currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyHasFindingAid.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographyHasFindingAidIterator theCartographyHasFindingAidIterator = (CartographyHasFindingAidIterator)findAncestorWithClass(this, CartographyHasFindingAidIterator.class);
			pageContext.getOut().print(theCartographyHasFindingAidIterator.getHasFindingAid());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for hasFindingAid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for hasFindingAid tag ");
		}
		return SKIP_BODY;
	}
}

