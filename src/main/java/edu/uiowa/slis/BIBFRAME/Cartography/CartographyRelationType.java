package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyRelationType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyRelationType currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyRelationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographyRelationIterator theCartographyRelationIterator = (CartographyRelationIterator)findAncestorWithClass(this, CartographyRelationIterator.class);
			pageContext.getOut().print(theCartographyRelationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for relation tag ");
		}
		return SKIP_BODY;
	}
}

