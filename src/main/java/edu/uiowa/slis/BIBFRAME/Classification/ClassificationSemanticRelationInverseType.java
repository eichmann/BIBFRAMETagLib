package edu.uiowa.slis.BIBFRAME.Classification;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClassificationSemanticRelationInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ClassificationSemanticRelationInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ClassificationSemanticRelationInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClassificationSemanticRelationInverseIterator theClassificationSemanticRelationInverseIterator = (ClassificationSemanticRelationInverseIterator)findAncestorWithClass(this, ClassificationSemanticRelationInverseIterator.class);
			pageContext.getOut().print(theClassificationSemanticRelationInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Classification for semanticRelation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Classification for semanticRelation tag ");
		}
		return SKIP_BODY;
	}
}

