package edu.uiowa.slis.BIBFRAME.PartNameElement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PartNameElementSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PartNameElementSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(PartNameElementSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			PartNameElement thePartNameElement = (PartNameElement)findAncestorWithClass(this, PartNameElement.class);
			if (!thePartNameElement.commitNeeded) {
				pageContext.getOut().print(thePartNameElement.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PartNameElement for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing PartNameElement for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			PartNameElement thePartNameElement = (PartNameElement)findAncestorWithClass(this, PartNameElement.class);
			return thePartNameElement.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing PartNameElement for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing PartNameElement for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			PartNameElement thePartNameElement = (PartNameElement)findAncestorWithClass(this, PartNameElement.class);
			thePartNameElement.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing PartNameElement for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing PartNameElement for subjectURI tag ");
		}
	}
}

