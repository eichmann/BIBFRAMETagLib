package edu.uiowa.slis.BIBFRAME.Electronic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ElectronicSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ElectronicSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ElectronicSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Electronic theElectronic = (Electronic)findAncestorWithClass(this, Electronic.class);
			if (!theElectronic.commitNeeded) {
				pageContext.getOut().print(theElectronic.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Electronic for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Electronic for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Electronic theElectronic = (Electronic)findAncestorWithClass(this, Electronic.class);
			return theElectronic.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Electronic for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Electronic for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Electronic theElectronic = (Electronic)findAncestorWithClass(this, Electronic.class);
			theElectronic.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Electronic for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Electronic for subjectURI tag ");
		}
	}
}

