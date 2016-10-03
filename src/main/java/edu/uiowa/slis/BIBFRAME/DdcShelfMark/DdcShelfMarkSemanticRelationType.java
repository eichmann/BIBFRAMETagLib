package edu.uiowa.slis.BIBFRAME.DdcShelfMark;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DdcShelfMarkSemanticRelationType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DdcShelfMarkSemanticRelationType currentInstance = null;
	private static final Log log = LogFactory.getLog(DdcShelfMarkSemanticRelationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DdcShelfMarkSemanticRelationIterator theDdcShelfMarkSemanticRelationIterator = (DdcShelfMarkSemanticRelationIterator)findAncestorWithClass(this, DdcShelfMarkSemanticRelationIterator.class);
			pageContext.getOut().print(theDdcShelfMarkSemanticRelationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DdcShelfMark for semanticRelation tag ", e);
			throw new JspTagException("Error: Can't find enclosing DdcShelfMark for semanticRelation tag ");
		}
		return SKIP_BODY;
	}
}

