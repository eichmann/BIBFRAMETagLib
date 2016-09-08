package edu.uiowa.slis.BIBFRAME.PartNumberElement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PartNumberElementSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PartNumberElementSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(PartNumberElementSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			PartNumberElement thePartNumberElement = (PartNumberElement)findAncestorWithClass(this, PartNumberElement.class);
			if (!thePartNumberElement.commitNeeded) {
				pageContext.getOut().print(thePartNumberElement.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PartNumberElement for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing PartNumberElement for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			PartNumberElement thePartNumberElement = (PartNumberElement)findAncestorWithClass(this, PartNumberElement.class);
			return thePartNumberElement.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing PartNumberElement for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing PartNumberElement for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			PartNumberElement thePartNumberElement = (PartNumberElement)findAncestorWithClass(this, PartNumberElement.class);
			thePartNumberElement.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing PartNumberElement for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing PartNumberElement for subjectURI tag ");
		}
	}
}

