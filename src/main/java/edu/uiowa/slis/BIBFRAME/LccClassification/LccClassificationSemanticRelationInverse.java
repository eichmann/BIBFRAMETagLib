package edu.uiowa.slis.BIBFRAME.LccClassification;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LccClassificationSemanticRelationInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static LccClassificationSemanticRelationInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(LccClassificationSemanticRelationInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LccClassificationSemanticRelationInverseIterator theLccClassificationSemanticRelationInverseIterator = (LccClassificationSemanticRelationInverseIterator)findAncestorWithClass(this, LccClassificationSemanticRelationInverseIterator.class);
			pageContext.getOut().print(theLccClassificationSemanticRelationInverseIterator.getSemanticRelationInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing LccClassification for semanticRelation tag ", e);
			throw new JspTagException("Error: Can't find enclosing LccClassification for semanticRelation tag ");
		}
		return SKIP_BODY;
	}
}

