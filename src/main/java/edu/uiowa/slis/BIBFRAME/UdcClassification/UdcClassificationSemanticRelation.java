package edu.uiowa.slis.BIBFRAME.UdcClassification;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UdcClassificationSemanticRelation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static UdcClassificationSemanticRelation currentInstance = null;
	private static final Log log = LogFactory.getLog(UdcClassificationSemanticRelation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UdcClassificationSemanticRelationIterator theUdcClassificationSemanticRelationIterator = (UdcClassificationSemanticRelationIterator)findAncestorWithClass(this, UdcClassificationSemanticRelationIterator.class);
			pageContext.getOut().print(theUdcClassificationSemanticRelationIterator.getSemanticRelation());
		} catch (Exception e) {
			log.error("Can't find enclosing UdcClassification for semanticRelation tag ", e);
			throw new JspTagException("Error: Can't find enclosing UdcClassification for semanticRelation tag ");
		}
		return SKIP_BODY;
	}
}

