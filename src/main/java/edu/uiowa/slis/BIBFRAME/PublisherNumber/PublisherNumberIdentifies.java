package edu.uiowa.slis.BIBFRAME.PublisherNumber;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherNumberIdentifies extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PublisherNumberIdentifies currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherNumberIdentifies.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PublisherNumberIdentifiesIterator thePublisherNumberIdentifiesIterator = (PublisherNumberIdentifiesIterator)findAncestorWithClass(this, PublisherNumberIdentifiesIterator.class);
			pageContext.getOut().print(thePublisherNumberIdentifiesIterator.getIdentifies());
		} catch (Exception e) {
			log.error("Can't find enclosing PublisherNumber for identifies tag ", e);
			throw new JspTagException("Error: Can't find enclosing PublisherNumber for identifies tag ");
		}
		return SKIP_BODY;
	}
}

