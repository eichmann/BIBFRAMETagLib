package edu.uiowa.slis.BIBFRAME.UdcClassification;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UdcClassificationSemanticRelationInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static UdcClassificationSemanticRelationInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(UdcClassificationSemanticRelationInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UdcClassificationSemanticRelationInverseIterator theUdcClassificationSemanticRelationInverseIterator = (UdcClassificationSemanticRelationInverseIterator)findAncestorWithClass(this, UdcClassificationSemanticRelationInverseIterator.class);
			pageContext.getOut().print(theUdcClassificationSemanticRelationInverseIterator.getSemanticRelationInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing UdcClassification for semanticRelation tag ", e);
			throw new JspTagException("Error: Can't find enclosing UdcClassification for semanticRelation tag ");
		}
		return SKIP_BODY;
	}
}

