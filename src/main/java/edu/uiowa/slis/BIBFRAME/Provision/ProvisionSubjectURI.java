package edu.uiowa.slis.BIBFRAME.Provision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProvisionSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ProvisionSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ProvisionSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Provision theProvision = (Provision)findAncestorWithClass(this, Provision.class);
			if (!theProvision.commitNeeded) {
				pageContext.getOut().print(theProvision.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Provision for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Provision for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Provision theProvision = (Provision)findAncestorWithClass(this, Provision.class);
			return theProvision.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Provision for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Provision for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Provision theProvision = (Provision)findAncestorWithClass(this, Provision.class);
			theProvision.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Provision for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Provision for subjectURI tag ");
		}
	}
}

