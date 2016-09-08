package edu.uiowa.slis.BIBFRAME.PublisherNumber;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherNumberSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PublisherNumberSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherNumberSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			PublisherNumber thePublisherNumber = (PublisherNumber)findAncestorWithClass(this, PublisherNumber.class);
			if (!thePublisherNumber.commitNeeded) {
				pageContext.getOut().print(thePublisherNumber.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PublisherNumber for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing PublisherNumber for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			PublisherNumber thePublisherNumber = (PublisherNumber)findAncestorWithClass(this, PublisherNumber.class);
			return thePublisherNumber.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing PublisherNumber for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing PublisherNumber for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			PublisherNumber thePublisherNumber = (PublisherNumber)findAncestorWithClass(this, PublisherNumber.class);
			thePublisherNumber.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing PublisherNumber for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing PublisherNumber for subjectURI tag ");
		}
	}
}

