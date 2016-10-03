package edu.uiowa.slis.BIBFRAME.DdcShelfMark;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DdcShelfMarkSemanticRelationInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DdcShelfMarkSemanticRelationInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(DdcShelfMarkSemanticRelationInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DdcShelfMarkSemanticRelationInverseIterator theDdcShelfMarkSemanticRelationInverseIterator = (DdcShelfMarkSemanticRelationInverseIterator)findAncestorWithClass(this, DdcShelfMarkSemanticRelationInverseIterator.class);
			pageContext.getOut().print(theDdcShelfMarkSemanticRelationInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DdcShelfMark for semanticRelation tag ", e);
			throw new JspTagException("Error: Can't find enclosing DdcShelfMark for semanticRelation tag ");
		}
		return SKIP_BODY;
	}
}

