package edu.uiowa.slis.BIBFRAME.NlmShelfMark;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NlmShelfMarkSemanticRelationInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NlmShelfMarkSemanticRelationInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(NlmShelfMarkSemanticRelationInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NlmShelfMarkSemanticRelationInverseIterator theNlmShelfMarkSemanticRelationInverseIterator = (NlmShelfMarkSemanticRelationInverseIterator)findAncestorWithClass(this, NlmShelfMarkSemanticRelationInverseIterator.class);
			pageContext.getOut().print(theNlmShelfMarkSemanticRelationInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NlmShelfMark for semanticRelation tag ", e);
			throw new JspTagException("Error: Can't find enclosing NlmShelfMark for semanticRelation tag ");
		}
		return SKIP_BODY;
	}
}

