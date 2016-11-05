package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyRelation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyRelation currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyRelation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographyRelationIterator theCartographyRelationIterator = (CartographyRelationIterator)findAncestorWithClass(this, CartographyRelationIterator.class);
			pageContext.getOut().print(theCartographyRelationIterator.getRelation());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for relation tag ");
		}
		return SKIP_BODY;
	}
}

