package edu.uiowa.slis.BIBFRAME.DdcClassification;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DdcClassificationSemanticRelation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DdcClassificationSemanticRelation currentInstance = null;
	private static final Log log = LogFactory.getLog(DdcClassificationSemanticRelation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DdcClassificationSemanticRelationIterator theDdcClassificationSemanticRelationIterator = (DdcClassificationSemanticRelationIterator)findAncestorWithClass(this, DdcClassificationSemanticRelationIterator.class);
			pageContext.getOut().print(theDdcClassificationSemanticRelationIterator.getSemanticRelation());
		} catch (Exception e) {
			log.error("Can't find enclosing DdcClassification for semanticRelation tag ", e);
			throw new JspTagException("Error: Can't find enclosing DdcClassification for semanticRelation tag ");
		}
		return SKIP_BODY;
	}
}

