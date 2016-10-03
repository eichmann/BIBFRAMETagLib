package edu.uiowa.slis.BIBFRAME.UdcClassification;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UdcClassificationSemanticRelationType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static UdcClassificationSemanticRelationType currentInstance = null;
	private static final Log log = LogFactory.getLog(UdcClassificationSemanticRelationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UdcClassificationSemanticRelationIterator theUdcClassificationSemanticRelationIterator = (UdcClassificationSemanticRelationIterator)findAncestorWithClass(this, UdcClassificationSemanticRelationIterator.class);
			pageContext.getOut().print(theUdcClassificationSemanticRelationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing UdcClassification for semanticRelation tag ", e);
			throw new JspTagException("Error: Can't find enclosing UdcClassification for semanticRelation tag ");
		}
		return SKIP_BODY;
	}
}

