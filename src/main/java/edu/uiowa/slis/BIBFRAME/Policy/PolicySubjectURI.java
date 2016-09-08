package edu.uiowa.slis.BIBFRAME.Policy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PolicySubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PolicySubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(PolicySubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Policy thePolicy = (Policy)findAncestorWithClass(this, Policy.class);
			if (!thePolicy.commitNeeded) {
				pageContext.getOut().print(thePolicy.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Policy for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Policy for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Policy thePolicy = (Policy)findAncestorWithClass(this, Policy.class);
			return thePolicy.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Policy for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Policy for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Policy thePolicy = (Policy)findAncestorWithClass(this, Policy.class);
			thePolicy.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Policy for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Policy for subjectURI tag ");
		}
	}
}

