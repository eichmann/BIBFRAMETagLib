package edu.uiowa.slis.BIBFRAME.NlmClassification;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NlmClassificationSemanticRelation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NlmClassificationSemanticRelation currentInstance = null;
	private static final Log log = LogFactory.getLog(NlmClassificationSemanticRelation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NlmClassificationSemanticRelationIterator theNlmClassificationSemanticRelationIterator = (NlmClassificationSemanticRelationIterator)findAncestorWithClass(this, NlmClassificationSemanticRelationIterator.class);
			pageContext.getOut().print(theNlmClassificationSemanticRelationIterator.getSemanticRelation());
		} catch (Exception e) {
			log.error("Can't find enclosing NlmClassification for semanticRelation tag ", e);
			throw new JspTagException("Error: Can't find enclosing NlmClassification for semanticRelation tag ");
		}
		return SKIP_BODY;
	}
}

