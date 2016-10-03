package edu.uiowa.slis.BIBFRAME.Concept;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConceptSemanticRelationInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ConceptSemanticRelationInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ConceptSemanticRelationInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConceptSemanticRelationInverseIterator theConceptSemanticRelationInverseIterator = (ConceptSemanticRelationInverseIterator)findAncestorWithClass(this, ConceptSemanticRelationInverseIterator.class);
			pageContext.getOut().print(theConceptSemanticRelationInverseIterator.getSemanticRelationInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Concept for semanticRelation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Concept for semanticRelation tag ");
		}
		return SKIP_BODY;
	}
}

