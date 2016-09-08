package edu.uiowa.slis.BIBFRAME.DistributorProvision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DistributorProvisionSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DistributorProvisionSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(DistributorProvisionSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			DistributorProvision theDistributorProvision = (DistributorProvision)findAncestorWithClass(this, DistributorProvision.class);
			if (!theDistributorProvision.commitNeeded) {
				pageContext.getOut().print(theDistributorProvision.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing DistributorProvision for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing DistributorProvision for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			DistributorProvision theDistributorProvision = (DistributorProvision)findAncestorWithClass(this, DistributorProvision.class);
			return theDistributorProvision.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing DistributorProvision for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing DistributorProvision for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			DistributorProvision theDistributorProvision = (DistributorProvision)findAncestorWithClass(this, DistributorProvision.class);
			theDistributorProvision.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing DistributorProvision for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing DistributorProvision for subjectURI tag ");
		}
	}
}

