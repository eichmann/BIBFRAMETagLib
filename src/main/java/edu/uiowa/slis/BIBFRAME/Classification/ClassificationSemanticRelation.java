package edu.uiowa.slis.BIBFRAME.Classification;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClassificationSemanticRelation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ClassificationSemanticRelation currentInstance = null;
	private static final Log log = LogFactory.getLog(ClassificationSemanticRelation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClassificationSemanticRelationIterator theClassificationSemanticRelationIterator = (ClassificationSemanticRelationIterator)findAncestorWithClass(this, ClassificationSemanticRelationIterator.class);
			pageContext.getOut().print(theClassificationSemanticRelationIterator.getSemanticRelation());
		} catch (Exception e) {
			log.error("Can't find enclosing Classification for semanticRelation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Classification for semanticRelation tag ");
		}
		return SKIP_BODY;
	}
}

