package edu.uiowa.slis.BIBFRAME.Ontology;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OntologyComment extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static OntologyComment currentInstance = null;
	private static final Log log = LogFactory.getLog(OntologyComment.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OntologyCommentIterator theOntology = (OntologyCommentIterator)findAncestorWithClass(this, OntologyCommentIterator.class);
			pageContext.getOut().print(theOntology.getComment());
		} catch (Exception e) {
			log.error("Can't find enclosing Ontology for comment tag ", e);
			throw new JspTagException("Error: Can't find enclosing Ontology for comment tag ");
		}
		return SKIP_BODY;
	}
}

