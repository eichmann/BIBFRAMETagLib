package edu.uiowa.slis.BIBFRAME.ShelfMark;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ShelfMarkSemanticRelationType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ShelfMarkSemanticRelationType currentInstance = null;
	private static final Log log = LogFactory.getLog(ShelfMarkSemanticRelationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ShelfMarkSemanticRelationIterator theShelfMarkSemanticRelationIterator = (ShelfMarkSemanticRelationIterator)findAncestorWithClass(this, ShelfMarkSemanticRelationIterator.class);
			pageContext.getOut().print(theShelfMarkSemanticRelationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ShelfMark for semanticRelation tag ", e);
			throw new JspTagException("Error: Can't find enclosing ShelfMark for semanticRelation tag ");
		}
		return SKIP_BODY;
	}
}

