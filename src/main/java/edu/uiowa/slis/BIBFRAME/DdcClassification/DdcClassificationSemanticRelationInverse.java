package edu.uiowa.slis.BIBFRAME.DdcClassification;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DdcClassificationSemanticRelationInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DdcClassificationSemanticRelationInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(DdcClassificationSemanticRelationInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DdcClassificationSemanticRelationInverseIterator theDdcClassificationSemanticRelationInverseIterator = (DdcClassificationSemanticRelationInverseIterator)findAncestorWithClass(this, DdcClassificationSemanticRelationInverseIterator.class);
			pageContext.getOut().print(theDdcClassificationSemanticRelationInverseIterator.getSemanticRelationInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing DdcClassification for semanticRelation tag ", e);
			throw new JspTagException("Error: Can't find enclosing DdcClassification for semanticRelation tag ");
		}
		return SKIP_BODY;
	}
}

