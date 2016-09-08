package edu.uiowa.slis.BIBFRAME.PublisherProvision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherProvisionAgent extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PublisherProvisionAgent currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherProvisionAgent.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PublisherProvisionAgentIterator thePublisherProvisionAgentIterator = (PublisherProvisionAgentIterator)findAncestorWithClass(this, PublisherProvisionAgentIterator.class);
			pageContext.getOut().print(thePublisherProvisionAgentIterator.getAgent());
		} catch (Exception e) {
			log.error("Can't find enclosing PublisherProvision for agent tag ", e);
			throw new JspTagException("Error: Can't find enclosing PublisherProvision for agent tag ");
		}
		return SKIP_BODY;
	}
}

