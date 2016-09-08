package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyHasContribution extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyHasContribution currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyHasContribution.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographyHasContributionIterator theCartographyHasContributionIterator = (CartographyHasContributionIterator)findAncestorWithClass(this, CartographyHasContributionIterator.class);
			pageContext.getOut().print(theCartographyHasContributionIterator.getHasContribution());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for hasContribution tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for hasContribution tag ");
		}
		return SKIP_BODY;
	}
}

