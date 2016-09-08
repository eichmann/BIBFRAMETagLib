package edu.uiowa.slis.BIBFRAME.PublisherProvision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherProvisionMadeAvailable extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PublisherProvisionMadeAvailable currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherProvisionMadeAvailable.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PublisherProvisionMadeAvailableIterator thePublisherProvisionMadeAvailableIterator = (PublisherProvisionMadeAvailableIterator)findAncestorWithClass(this, PublisherProvisionMadeAvailableIterator.class);
			pageContext.getOut().print(thePublisherProvisionMadeAvailableIterator.getMadeAvailable());
		} catch (Exception e) {
			log.error("Can't find enclosing PublisherProvision for madeAvailable tag ", e);
			throw new JspTagException("Error: Can't find enclosing PublisherProvision for madeAvailable tag ");
		}
		return SKIP_BODY;
	}
}

