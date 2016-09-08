package edu.uiowa.slis.BIBFRAME.PublisherNumber;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherNumberLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PublisherNumberLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherNumberLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			PublisherNumber thePublisherNumber = (PublisherNumber)findAncestorWithClass(this, PublisherNumber.class);
			if (!thePublisherNumber.commitNeeded) {
				pageContext.getOut().print(thePublisherNumber.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PublisherNumber for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing PublisherNumber for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			PublisherNumber thePublisherNumber = (PublisherNumber)findAncestorWithClass(this, PublisherNumber.class);
			return thePublisherNumber.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing PublisherNumber for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing PublisherNumber for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			PublisherNumber thePublisherNumber = (PublisherNumber)findAncestorWithClass(this, PublisherNumber.class);
			thePublisherNumber.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing PublisherNumber for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing PublisherNumber for label tag ");
		}
	}
}

