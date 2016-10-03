package edu.uiowa.slis.BIBFRAME.Classification;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClassificationSemanticRelationType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ClassificationSemanticRelationType currentInstance = null;
	private static final Log log = LogFactory.getLog(ClassificationSemanticRelationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClassificationSemanticRelationIterator theClassificationSemanticRelationIterator = (ClassificationSemanticRelationIterator)findAncestorWithClass(this, ClassificationSemanticRelationIterator.class);
			pageContext.getOut().print(theClassificationSemanticRelationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Classification for semanticRelation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Classification for semanticRelation tag ");
		}
		return SKIP_BODY;
	}
}

