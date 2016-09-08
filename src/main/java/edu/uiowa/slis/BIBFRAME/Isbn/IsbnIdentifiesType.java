package edu.uiowa.slis.BIBFRAME.Isbn;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IsbnIdentifiesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IsbnIdentifiesType currentInstance = null;
	private static final Log log = LogFactory.getLog(IsbnIdentifiesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IsbnIdentifiesIterator theIsbnIdentifiesIterator = (IsbnIdentifiesIterator)findAncestorWithClass(this, IsbnIdentifiesIterator.class);
			pageContext.getOut().print(theIsbnIdentifiesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Isbn for identifies tag ", e);
			throw new JspTagException("Error: Can't find enclosing Isbn for identifies tag ");
		}
		return SKIP_BODY;
	}
}

