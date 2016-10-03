package edu.uiowa.slis.BIBFRAME.NlmClassification;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NlmClassificationSemanticRelationType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NlmClassificationSemanticRelationType currentInstance = null;
	private static final Log log = LogFactory.getLog(NlmClassificationSemanticRelationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NlmClassificationSemanticRelationIterator theNlmClassificationSemanticRelationIterator = (NlmClassificationSemanticRelationIterator)findAncestorWithClass(this, NlmClassificationSemanticRelationIterator.class);
			pageContext.getOut().print(theNlmClassificationSemanticRelationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NlmClassification for semanticRelation tag ", e);
			throw new JspTagException("Error: Can't find enclosing NlmClassification for semanticRelation tag ");
		}
		return SKIP_BODY;
	}
}

