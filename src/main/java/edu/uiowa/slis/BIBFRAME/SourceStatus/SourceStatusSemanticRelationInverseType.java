package edu.uiowa.slis.BIBFRAME.SourceStatus;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SourceStatusSemanticRelationInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SourceStatusSemanticRelationInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(SourceStatusSemanticRelationInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SourceStatusSemanticRelationInverseIterator theSourceStatusSemanticRelationInverseIterator = (SourceStatusSemanticRelationInverseIterator)findAncestorWithClass(this, SourceStatusSemanticRelationInverseIterator.class);
			pageContext.getOut().print(theSourceStatusSemanticRelationInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing SourceStatus for semanticRelation tag ", e);
			throw new JspTagException("Error: Can't find enclosing SourceStatus for semanticRelation tag ");
		}
		return SKIP_BODY;
	}
}

