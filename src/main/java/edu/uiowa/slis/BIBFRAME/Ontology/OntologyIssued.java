package edu.uiowa.slis.BIBFRAME.Ontology;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OntologyIssued extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static OntologyIssued currentInstance = null;
	private static final Log log = LogFactory.getLog(OntologyIssued.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OntologyIssuedIterator theOntology = (OntologyIssuedIterator)findAncestorWithClass(this, OntologyIssuedIterator.class);
			pageContext.getOut().print(theOntology.getIssued());
		} catch (Exception e) {
			log.error("Can't find enclosing Ontology for issued tag ", e);
			throw new JspTagException("Error: Can't find enclosing Ontology for issued tag ");
		}
		return SKIP_BODY;
	}
}

