package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyRelationInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyRelationInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyRelationInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographyRelationInverseIterator theCartographyRelationInverseIterator = (CartographyRelationInverseIterator)findAncestorWithClass(this, CartographyRelationInverseIterator.class);
			pageContext.getOut().print(theCartographyRelationInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for relation tag ");
		}
		return SKIP_BODY;
	}
}

