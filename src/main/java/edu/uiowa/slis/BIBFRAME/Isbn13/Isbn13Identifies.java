package edu.uiowa.slis.BIBFRAME.Isbn13;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Isbn13Identifies extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static Isbn13Identifies currentInstance = null;
	private static final Log log = LogFactory.getLog(Isbn13Identifies.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			Isbn13IdentifiesIterator theIsbn13IdentifiesIterator = (Isbn13IdentifiesIterator)findAncestorWithClass(this, Isbn13IdentifiesIterator.class);
			pageContext.getOut().print(theIsbn13IdentifiesIterator.getIdentifies());
		} catch (Exception e) {
			log.error("Can't find enclosing Isbn13 for identifies tag ", e);
			throw new JspTagException("Error: Can't find enclosing Isbn13 for identifies tag ");
		}
		return SKIP_BODY;
	}
}

