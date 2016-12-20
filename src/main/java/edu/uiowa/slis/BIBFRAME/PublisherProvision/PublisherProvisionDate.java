package edu.uiowa.slis.BIBFRAME.PublisherProvision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherProvisionDate extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PublisherProvisionDate currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherProvisionDate.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherProvisionDateIterator thePublisherProvision = (PublisherProvisionDateIterator)findAncestorWithClass(this, PublisherProvisionDateIterator.class);
			pageContext.getOut().print(thePublisherProvision.getDate());
		} catch (Exception e) {
			log.error("Can't find enclosing PublisherProvision for date tag ", e);
			throw new JspTagException("Error: Can't find enclosing PublisherProvision for date tag ");
		}
		return SKIP_BODY;
	}
}

