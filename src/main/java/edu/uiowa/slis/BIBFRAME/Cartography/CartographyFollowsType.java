package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyFollowsType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyFollowsType currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyFollowsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographyFollowsIterator theCartographyFollowsIterator = (CartographyFollowsIterator)findAncestorWithClass(this, CartographyFollowsIterator.class);
			pageContext.getOut().print(theCartographyFollowsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for follows tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for follows tag ");
		}
		return SKIP_BODY;
	}
}

