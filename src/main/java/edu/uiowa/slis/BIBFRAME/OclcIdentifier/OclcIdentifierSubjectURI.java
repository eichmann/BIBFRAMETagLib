package edu.uiowa.slis.BIBFRAME.OclcIdentifier;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OclcIdentifierSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static OclcIdentifierSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(OclcIdentifierSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			OclcIdentifier theOclcIdentifier = (OclcIdentifier)findAncestorWithClass(this, OclcIdentifier.class);
			if (!theOclcIdentifier.commitNeeded) {
				pageContext.getOut().print(theOclcIdentifier.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing OclcIdentifier for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing OclcIdentifier for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			OclcIdentifier theOclcIdentifier = (OclcIdentifier)findAncestorWithClass(this, OclcIdentifier.class);
			return theOclcIdentifier.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing OclcIdentifier for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing OclcIdentifier for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			OclcIdentifier theOclcIdentifier = (OclcIdentifier)findAncestorWithClass(this, OclcIdentifier.class);
			theOclcIdentifier.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing OclcIdentifier for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing OclcIdentifier for subjectURI tag ");
		}
	}
}

