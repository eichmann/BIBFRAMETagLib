package edu.uiowa.slis.BIBFRAME.DdcClassification;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DdcClassificationSemanticRelationType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DdcClassificationSemanticRelationType currentInstance = null;
	private static final Log log = LogFactory.getLog(DdcClassificationSemanticRelationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DdcClassificationSemanticRelationIterator theDdcClassificationSemanticRelationIterator = (DdcClassificationSemanticRelationIterator)findAncestorWithClass(this, DdcClassificationSemanticRelationIterator.class);
			pageContext.getOut().print(theDdcClassificationSemanticRelationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DdcClassification for semanticRelation tag ", e);
			throw new JspTagException("Error: Can't find enclosing DdcClassification for semanticRelation tag ");
		}
		return SKIP_BODY;
	}
}

