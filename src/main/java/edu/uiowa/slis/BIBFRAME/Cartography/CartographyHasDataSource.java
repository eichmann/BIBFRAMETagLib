package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyHasDataSource extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyHasDataSource currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyHasDataSource.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographyHasDataSourceIterator theCartographyHasDataSourceIterator = (CartographyHasDataSourceIterator)findAncestorWithClass(this, CartographyHasDataSourceIterator.class);
			pageContext.getOut().print(theCartographyHasDataSourceIterator.getHasDataSource());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for hasDataSource tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for hasDataSource tag ");
		}
		return SKIP_BODY;
	}
}

