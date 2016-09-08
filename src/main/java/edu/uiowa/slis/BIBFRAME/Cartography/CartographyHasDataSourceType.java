package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyHasDataSourceType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyHasDataSourceType currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyHasDataSourceType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographyHasDataSourceIterator theCartographyHasDataSourceIterator = (CartographyHasDataSourceIterator)findAncestorWithClass(this, CartographyHasDataSourceIterator.class);
			pageContext.getOut().print(theCartographyHasDataSourceIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for hasDataSource tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for hasDataSource tag ");
		}
		return SKIP_BODY;
	}
}

