package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyHasDataSourceInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyHasDataSourceInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyHasDataSourceInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographyHasDataSourceInverseIterator theCartographyHasDataSourceInverseIterator = (CartographyHasDataSourceInverseIterator)findAncestorWithClass(this, CartographyHasDataSourceInverseIterator.class);
			pageContext.getOut().print(theCartographyHasDataSourceInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for hasDataSource tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for hasDataSource tag ");
		}
		return SKIP_BODY;
	}
}
