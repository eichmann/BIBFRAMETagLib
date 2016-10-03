package edu.uiowa.slis.BIBFRAME.ShelfMark;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ShelfMarkSemanticRelationInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ShelfMarkSemanticRelationInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ShelfMarkSemanticRelationInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ShelfMarkSemanticRelationInverseIterator theShelfMarkSemanticRelationInverseIterator = (ShelfMarkSemanticRelationInverseIterator)findAncestorWithClass(this, ShelfMarkSemanticRelationInverseIterator.class);
			pageContext.getOut().print(theShelfMarkSemanticRelationInverseIterator.getSemanticRelationInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing ShelfMark for semanticRelation tag ", e);
			throw new JspTagException("Error: Can't find enclosing ShelfMark for semanticRelation tag ");
		}
		return SKIP_BODY;
	}
}

