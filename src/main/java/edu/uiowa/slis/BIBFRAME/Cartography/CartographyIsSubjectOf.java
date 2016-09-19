package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyIsSubjectOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyIsSubjectOf currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyIsSubjectOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographyIsSubjectOfIterator theCartographyIsSubjectOfIterator = (CartographyIsSubjectOfIterator)findAncestorWithClass(this, CartographyIsSubjectOfIterator.class);
			pageContext.getOut().print(theCartographyIsSubjectOfIterator.getIsSubjectOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for isSubjectOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for isSubjectOf tag ");
		}
		return SKIP_BODY;
	}
}

