package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyPerformedAt extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyPerformedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyPerformedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographyPerformedAtIterator theCartographyPerformedAtIterator = (CartographyPerformedAtIterator)findAncestorWithClass(this, CartographyPerformedAtIterator.class);
			pageContext.getOut().print(theCartographyPerformedAtIterator.getPerformedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for performedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for performedAt tag ");
		}
		return SKIP_BODY;
	}
}
