package edu.uiowa.slis.BIBFRAME.ManufacturerProvision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManufacturerProvisionSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ManufacturerProvisionSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ManufacturerProvisionSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ManufacturerProvision theManufacturerProvision = (ManufacturerProvision)findAncestorWithClass(this, ManufacturerProvision.class);
			if (!theManufacturerProvision.commitNeeded) {
				pageContext.getOut().print(theManufacturerProvision.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ManufacturerProvision for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ManufacturerProvision for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			ManufacturerProvision theManufacturerProvision = (ManufacturerProvision)findAncestorWithClass(this, ManufacturerProvision.class);
			return theManufacturerProvision.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing ManufacturerProvision for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ManufacturerProvision for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			ManufacturerProvision theManufacturerProvision = (ManufacturerProvision)findAncestorWithClass(this, ManufacturerProvision.class);
			theManufacturerProvision.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing ManufacturerProvision for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ManufacturerProvision for subjectURI tag ");
		}
	}
}

