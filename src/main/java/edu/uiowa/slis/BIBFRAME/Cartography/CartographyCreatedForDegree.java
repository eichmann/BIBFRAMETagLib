package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyCreatedForDegree extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyCreatedForDegree currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyCreatedForDegree.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographyCreatedForDegreeIterator theCartographyCreatedForDegreeIterator = (CartographyCreatedForDegreeIterator)findAncestorWithClass(this, CartographyCreatedForDegreeIterator.class);
			pageContext.getOut().print(theCartographyCreatedForDegreeIterator.getCreatedForDegree());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for createdForDegree tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for createdForDegree tag ");
		}
		return SKIP_BODY;
	}
}

