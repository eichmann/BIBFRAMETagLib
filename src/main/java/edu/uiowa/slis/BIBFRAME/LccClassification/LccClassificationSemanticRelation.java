package edu.uiowa.slis.BIBFRAME.LccClassification;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LccClassificationSemanticRelation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static LccClassificationSemanticRelation currentInstance = null;
	private static final Log log = LogFactory.getLog(LccClassificationSemanticRelation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LccClassificationSemanticRelationIterator theLccClassificationSemanticRelationIterator = (LccClassificationSemanticRelationIterator)findAncestorWithClass(this, LccClassificationSemanticRelationIterator.class);
			pageContext.getOut().print(theLccClassificationSemanticRelationIterator.getSemanticRelation());
		} catch (Exception e) {
			log.error("Can't find enclosing LccClassification for semanticRelation tag ", e);
			throw new JspTagException("Error: Can't find enclosing LccClassification for semanticRelation tag ");
		}
		return SKIP_BODY;
	}
}

