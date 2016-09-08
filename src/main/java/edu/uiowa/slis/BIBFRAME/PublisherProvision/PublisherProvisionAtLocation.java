package edu.uiowa.slis.BIBFRAME.PublisherProvision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherProvisionAtLocation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PublisherProvisionAtLocation currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherProvisionAtLocation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PublisherProvisionAtLocationIterator thePublisherProvisionAtLocationIterator = (PublisherProvisionAtLocationIterator)findAncestorWithClass(this, PublisherProvisionAtLocationIterator.class);
			pageContext.getOut().print(thePublisherProvisionAtLocationIterator.getAtLocation());
		} catch (Exception e) {
			log.error("Can't find enclosing PublisherProvision for atLocation tag ", e);
			throw new JspTagException("Error: Can't find enclosing PublisherProvision for atLocation tag ");
		}
		return SKIP_BODY;
	}
}

