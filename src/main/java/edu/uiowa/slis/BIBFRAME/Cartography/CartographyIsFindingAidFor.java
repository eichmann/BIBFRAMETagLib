package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyIsFindingAidFor extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyIsFindingAidFor currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyIsFindingAidFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographyIsFindingAidForIterator theCartographyIsFindingAidForIterator = (CartographyIsFindingAidForIterator)findAncestorWithClass(this, CartographyIsFindingAidForIterator.class);
			pageContext.getOut().print(theCartographyIsFindingAidForIterator.getIsFindingAidFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for isFindingAidFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for isFindingAidFor tag ");
		}
		return SKIP_BODY;
	}
}

