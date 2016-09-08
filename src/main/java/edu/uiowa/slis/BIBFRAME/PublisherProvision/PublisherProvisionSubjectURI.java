package edu.uiowa.slis.BIBFRAME.PublisherProvision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherProvisionSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PublisherProvisionSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherProvisionSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			PublisherProvision thePublisherProvision = (PublisherProvision)findAncestorWithClass(this, PublisherProvision.class);
			if (!thePublisherProvision.commitNeeded) {
				pageContext.getOut().print(thePublisherProvision.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PublisherProvision for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing PublisherProvision for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			PublisherProvision thePublisherProvision = (PublisherProvision)findAncestorWithClass(this, PublisherProvision.class);
			return thePublisherProvision.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing PublisherProvision for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing PublisherProvision for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			PublisherProvision thePublisherProvision = (PublisherProvision)findAncestorWithClass(this, PublisherProvision.class);
			thePublisherProvision.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing PublisherProvision for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing PublisherProvision for subjectURI tag ");
		}
	}
}

