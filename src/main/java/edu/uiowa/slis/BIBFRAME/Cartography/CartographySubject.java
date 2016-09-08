package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographySubject extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographySubject currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographySubject.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CartographySubjectIterator theCartographySubjectIterator = (CartographySubjectIterator)findAncestorWithClass(this, CartographySubjectIterator.class);
			pageContext.getOut().print(theCartographySubjectIterator.getSubject());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for subject tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for subject tag ");
		}
		return SKIP_BODY;
	}
}

