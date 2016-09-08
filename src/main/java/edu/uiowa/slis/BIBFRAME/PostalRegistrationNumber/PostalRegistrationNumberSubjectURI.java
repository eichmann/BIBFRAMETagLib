package edu.uiowa.slis.BIBFRAME.PostalRegistrationNumber;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostalRegistrationNumberSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PostalRegistrationNumberSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(PostalRegistrationNumberSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			PostalRegistrationNumber thePostalRegistrationNumber = (PostalRegistrationNumber)findAncestorWithClass(this, PostalRegistrationNumber.class);
			if (!thePostalRegistrationNumber.commitNeeded) {
				pageContext.getOut().print(thePostalRegistrationNumber.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PostalRegistrationNumber for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostalRegistrationNumber for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			PostalRegistrationNumber thePostalRegistrationNumber = (PostalRegistrationNumber)findAncestorWithClass(this, PostalRegistrationNumber.class);
			return thePostalRegistrationNumber.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing PostalRegistrationNumber for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostalRegistrationNumber for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			PostalRegistrationNumber thePostalRegistrationNumber = (PostalRegistrationNumber)findAncestorWithClass(this, PostalRegistrationNumber.class);
			thePostalRegistrationNumber.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing PostalRegistrationNumber for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostalRegistrationNumber for subjectURI tag ");
		}
	}
}

