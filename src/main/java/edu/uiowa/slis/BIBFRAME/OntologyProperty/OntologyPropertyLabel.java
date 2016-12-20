package edu.uiowa.slis.BIBFRAME.OntologyProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OntologyPropertyLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static OntologyPropertyLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(OntologyPropertyLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			OntologyProperty theOntologyProperty = (OntologyProperty)findAncestorWithClass(this, OntologyProperty.class);
			if (!theOntologyProperty.commitNeeded) {
				pageContext.getOut().print(theOntologyProperty.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing OntologyProperty for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing OntologyProperty for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			OntologyProperty theOntologyProperty = (OntologyProperty)findAncestorWithClass(this, OntologyProperty.class);
			return theOntologyProperty.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing OntologyProperty for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing OntologyProperty for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			OntologyProperty theOntologyProperty = (OntologyProperty)findAncestorWithClass(this, OntologyProperty.class);
			theOntologyProperty.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing OntologyProperty for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing OntologyProperty for label tag ");
		}
	}
}

