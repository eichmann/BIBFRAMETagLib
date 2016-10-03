package edu.uiowa.slis.BIBFRAME.Concept;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConceptSemanticRelationType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ConceptSemanticRelationType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConceptSemanticRelationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConceptSemanticRelationIterator theConceptSemanticRelationIterator = (ConceptSemanticRelationIterator)findAncestorWithClass(this, ConceptSemanticRelationIterator.class);
			pageContext.getOut().print(theConceptSemanticRelationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Concept for semanticRelation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Concept for semanticRelation tag ");
		}
		return SKIP_BODY;
	}
}

