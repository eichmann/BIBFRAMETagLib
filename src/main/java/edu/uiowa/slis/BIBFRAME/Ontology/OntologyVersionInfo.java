package edu.uiowa.slis.BIBFRAME.Ontology;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OntologyVersionInfo extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static OntologyVersionInfo currentInstance = null;
	private static final Log log = LogFactory.getLog(OntologyVersionInfo.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OntologyVersionInfoIterator theOntology = (OntologyVersionInfoIterator)findAncestorWithClass(this, OntologyVersionInfoIterator.class);
			pageContext.getOut().print(theOntology.getVersionInfo());
		} catch (Exception e) {
			log.error("Can't find enclosing Ontology for versionInfo tag ", e);
			throw new JspTagException("Error: Can't find enclosing Ontology for versionInfo tag ");
		}
		return SKIP_BODY;
	}
}

