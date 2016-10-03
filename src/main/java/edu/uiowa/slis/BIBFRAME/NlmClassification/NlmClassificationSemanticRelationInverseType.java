package edu.uiowa.slis.BIBFRAME.NlmClassification;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NlmClassificationSemanticRelationInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NlmClassificationSemanticRelationInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(NlmClassificationSemanticRelationInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NlmClassificationSemanticRelationInverseIterator theNlmClassificationSemanticRelationInverseIterator = (NlmClassificationSemanticRelationInverseIterator)findAncestorWithClass(this, NlmClassificationSemanticRelationInverseIterator.class);
			pageContext.getOut().print(theNlmClassificationSemanticRelationInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NlmClassification for semanticRelation tag ", e);
			throw new JspTagException("Error: Can't find enclosing NlmClassification for semanticRelation tag ");
		}
		return SKIP_BODY;
	}
}

