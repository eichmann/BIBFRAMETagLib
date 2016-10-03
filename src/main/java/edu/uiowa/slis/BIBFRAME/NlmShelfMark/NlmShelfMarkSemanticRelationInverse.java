package edu.uiowa.slis.BIBFRAME.NlmShelfMark;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NlmShelfMarkSemanticRelationInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NlmShelfMarkSemanticRelationInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(NlmShelfMarkSemanticRelationInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NlmShelfMarkSemanticRelationInverseIterator theNlmShelfMarkSemanticRelationInverseIterator = (NlmShelfMarkSemanticRelationInverseIterator)findAncestorWithClass(this, NlmShelfMarkSemanticRelationInverseIterator.class);
			pageContext.getOut().print(theNlmShelfMarkSemanticRelationInverseIterator.getSemanticRelationInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing NlmShelfMark for semanticRelation tag ", e);
			throw new JspTagException("Error: Can't find enclosing NlmShelfMark for semanticRelation tag ");
		}
		return SKIP_BODY;
	}
}

