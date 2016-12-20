package edu.uiowa.slis.BIBFRAME.Ontology;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OntologyModified extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static OntologyModified currentInstance = null;
	private static final Log log = LogFactory.getLog(OntologyModified.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OntologyModifiedIterator theOntology = (OntologyModifiedIterator)findAncestorWithClass(this, OntologyModifiedIterator.class);
			pageContext.getOut().print(theOntology.getModified());
		} catch (Exception e) {
			log.error("Can't find enclosing Ontology for modified tag ", e);
			throw new JspTagException("Error: Can't find enclosing Ontology for modified tag ");
		}
		return SKIP_BODY;
	}
}

