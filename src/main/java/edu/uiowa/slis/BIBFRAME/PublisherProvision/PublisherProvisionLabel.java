package edu.uiowa.slis.BIBFRAME.PublisherProvision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherProvisionLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PublisherProvisionLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherProvisionLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			PublisherProvision thePublisherProvision = (PublisherProvision)findAncestorWithClass(this, PublisherProvision.class);
			if (!thePublisherProvision.commitNeeded) {
				pageContext.getOut().print(thePublisherProvision.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PublisherProvision for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing PublisherProvision for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			PublisherProvision thePublisherProvision = (PublisherProvision)findAncestorWithClass(this, PublisherProvision.class);
			return thePublisherProvision.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing PublisherProvision for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing PublisherProvision for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			PublisherProvision thePublisherProvision = (PublisherProvision)findAncestorWithClass(this, PublisherProvision.class);
			thePublisherProvision.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing PublisherProvision for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing PublisherProvision for label tag ");
		}
	}
}

