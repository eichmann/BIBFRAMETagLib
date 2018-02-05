package edu.uiowa.slis.BIBFRAME.Ontology;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OntologyLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static OntologyLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(OntologyLabel.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OntologyLabelIterator theOntology = (OntologyLabelIterator)findAncestorWithClass(this, OntologyLabelIterator.class);
			pageContext.getOut().print(theOntology.getLabel());
		} catch (Exception e) {
			log.error("Can't find enclosing Ontology for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Ontology for label tag ");
		}
		return SKIP_BODY;
	}
}

