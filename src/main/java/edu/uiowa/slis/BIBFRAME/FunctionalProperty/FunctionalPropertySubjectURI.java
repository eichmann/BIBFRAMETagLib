package edu.uiowa.slis.BIBFRAME.FunctionalProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FunctionalPropertySubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FunctionalPropertySubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(FunctionalPropertySubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			FunctionalProperty theFunctionalProperty = (FunctionalProperty)findAncestorWithClass(this, FunctionalProperty.class);
			if (!theFunctionalProperty.commitNeeded) {
				pageContext.getOut().print(theFunctionalProperty.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing FunctionalProperty for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing FunctionalProperty for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			FunctionalProperty theFunctionalProperty = (FunctionalProperty)findAncestorWithClass(this, FunctionalProperty.class);
			return theFunctionalProperty.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing FunctionalProperty for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing FunctionalProperty for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			FunctionalProperty theFunctionalProperty = (FunctionalProperty)findAncestorWithClass(this, FunctionalProperty.class);
			theFunctionalProperty.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing FunctionalProperty for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing FunctionalProperty for subjectURI tag ");
		}
	}
}

