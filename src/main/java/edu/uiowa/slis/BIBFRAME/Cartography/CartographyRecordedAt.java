package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyRecordedAt extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyRecordedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyRecordedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographyRecordedAtIterator theCartographyRecordedAtIterator = (CartographyRecordedAtIterator)findAncestorWithClass(this, CartographyRecordedAtIterator.class);
			pageContext.getOut().print(theCartographyRecordedAtIterator.getRecordedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for recordedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for recordedAt tag ");
		}
		return SKIP_BODY;
	}
}

