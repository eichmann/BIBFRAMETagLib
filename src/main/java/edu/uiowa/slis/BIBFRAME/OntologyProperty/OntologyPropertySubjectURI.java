package edu.uiowa.slis.BIBFRAME.OntologyProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OntologyPropertySubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static OntologyPropertySubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(OntologyPropertySubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			OntologyProperty theOntologyProperty = (OntologyProperty)findAncestorWithClass(this, OntologyProperty.class);
			if (!theOntologyProperty.commitNeeded) {
				pageContext.getOut().print(theOntologyProperty.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing OntologyProperty for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing OntologyProperty for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			OntologyProperty theOntologyProperty = (OntologyProperty)findAncestorWithClass(this, OntologyProperty.class);
			return theOntologyProperty.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing OntologyProperty for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing OntologyProperty for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			OntologyProperty theOntologyProperty = (OntologyProperty)findAncestorWithClass(this, OntologyProperty.class);
			theOntologyProperty.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing OntologyProperty for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing OntologyProperty for subjectURI tag ");
		}
	}
}

