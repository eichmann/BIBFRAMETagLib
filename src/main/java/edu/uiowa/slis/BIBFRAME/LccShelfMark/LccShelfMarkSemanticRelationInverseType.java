package edu.uiowa.slis.BIBFRAME.LccShelfMark;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LccShelfMarkSemanticRelationInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static LccShelfMarkSemanticRelationInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(LccShelfMarkSemanticRelationInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LccShelfMarkSemanticRelationInverseIterator theLccShelfMarkSemanticRelationInverseIterator = (LccShelfMarkSemanticRelationInverseIterator)findAncestorWithClass(this, LccShelfMarkSemanticRelationInverseIterator.class);
			pageContext.getOut().print(theLccShelfMarkSemanticRelationInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LccShelfMark for semanticRelation tag ", e);
			throw new JspTagException("Error: Can't find enclosing LccShelfMark for semanticRelation tag ");
		}
		return SKIP_BODY;
	}
}

