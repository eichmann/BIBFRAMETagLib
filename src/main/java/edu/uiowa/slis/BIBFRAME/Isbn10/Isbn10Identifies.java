package edu.uiowa.slis.BIBFRAME.Isbn10;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Isbn10Identifies extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static Isbn10Identifies currentInstance = null;
	private static final Log log = LogFactory.getLog(Isbn10Identifies.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			Isbn10IdentifiesIterator theIsbn10IdentifiesIterator = (Isbn10IdentifiesIterator)findAncestorWithClass(this, Isbn10IdentifiesIterator.class);
			pageContext.getOut().print(theIsbn10IdentifiesIterator.getIdentifies());
		} catch (Exception e) {
			log.error("Can't find enclosing Isbn10 for identifies tag ", e);
			throw new JspTagException("Error: Can't find enclosing Isbn10 for identifies tag ");
		}
		return SKIP_BODY;
	}
}
