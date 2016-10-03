package edu.uiowa.slis.BIBFRAME.LccShelfMark;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LccShelfMarkSemanticRelation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static LccShelfMarkSemanticRelation currentInstance = null;
	private static final Log log = LogFactory.getLog(LccShelfMarkSemanticRelation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LccShelfMarkSemanticRelationIterator theLccShelfMarkSemanticRelationIterator = (LccShelfMarkSemanticRelationIterator)findAncestorWithClass(this, LccShelfMarkSemanticRelationIterator.class);
			pageContext.getOut().print(theLccShelfMarkSemanticRelationIterator.getSemanticRelation());
		} catch (Exception e) {
			log.error("Can't find enclosing LccShelfMark for semanticRelation tag ", e);
			throw new JspTagException("Error: Can't find enclosing LccShelfMark for semanticRelation tag ");
		}
		return SKIP_BODY;
	}
}

