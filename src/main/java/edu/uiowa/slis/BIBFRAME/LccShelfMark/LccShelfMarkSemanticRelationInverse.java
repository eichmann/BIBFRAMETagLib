package edu.uiowa.slis.BIBFRAME.LccShelfMark;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LccShelfMarkSemanticRelationInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static LccShelfMarkSemanticRelationInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(LccShelfMarkSemanticRelationInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LccShelfMarkSemanticRelationInverseIterator theLccShelfMarkSemanticRelationInverseIterator = (LccShelfMarkSemanticRelationInverseIterator)findAncestorWithClass(this, LccShelfMarkSemanticRelationInverseIterator.class);
			pageContext.getOut().print(theLccShelfMarkSemanticRelationInverseIterator.getSemanticRelationInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing LccShelfMark for semanticRelation tag ", e);
			throw new JspTagException("Error: Can't find enclosing LccShelfMark for semanticRelation tag ");
		}
		return SKIP_BODY;
	}
}

