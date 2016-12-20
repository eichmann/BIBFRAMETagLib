package edu.uiowa.slis.BIBFRAME.Ontology;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OntologyPreferredNamespacePrefix extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static OntologyPreferredNamespacePrefix currentInstance = null;
	private static final Log log = LogFactory.getLog(OntologyPreferredNamespacePrefix.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OntologyPreferredNamespacePrefixIterator theOntology = (OntologyPreferredNamespacePrefixIterator)findAncestorWithClass(this, OntologyPreferredNamespacePrefixIterator.class);
			pageContext.getOut().print(theOntology.getPreferredNamespacePrefix());
		} catch (Exception e) {
			log.error("Can't find enclosing Ontology for preferredNamespacePrefix tag ", e);
			throw new JspTagException("Error: Can't find enclosing Ontology for preferredNamespacePrefix tag ");
		}
		return SKIP_BODY;
	}
}

