package edu.uiowa.slis.BIBFRAME.SourceStatus;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SourceStatusSemanticRelationType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SourceStatusSemanticRelationType currentInstance = null;
	private static final Log log = LogFactory.getLog(SourceStatusSemanticRelationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SourceStatusSemanticRelationIterator theSourceStatusSemanticRelationIterator = (SourceStatusSemanticRelationIterator)findAncestorWithClass(this, SourceStatusSemanticRelationIterator.class);
			pageContext.getOut().print(theSourceStatusSemanticRelationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing SourceStatus for semanticRelation tag ", e);
			throw new JspTagException("Error: Can't find enclosing SourceStatus for semanticRelation tag ");
		}
		return SKIP_BODY;
	}
}

