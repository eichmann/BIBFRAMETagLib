package edu.uiowa.slis.BIBFRAME.NlmShelfMark;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NlmShelfMarkSemanticRelation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NlmShelfMarkSemanticRelation currentInstance = null;
	private static final Log log = LogFactory.getLog(NlmShelfMarkSemanticRelation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NlmShelfMarkSemanticRelationIterator theNlmShelfMarkSemanticRelationIterator = (NlmShelfMarkSemanticRelationIterator)findAncestorWithClass(this, NlmShelfMarkSemanticRelationIterator.class);
			pageContext.getOut().print(theNlmShelfMarkSemanticRelationIterator.getSemanticRelation());
		} catch (Exception e) {
			log.error("Can't find enclosing NlmShelfMark for semanticRelation tag ", e);
			throw new JspTagException("Error: Can't find enclosing NlmShelfMark for semanticRelation tag ");
		}
		return SKIP_BODY;
	}
}
