package edu.uiowa.slis.BIBFRAME.UdcShelfMark;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UdcShelfMarkSemanticRelationType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static UdcShelfMarkSemanticRelationType currentInstance = null;
	private static final Log log = LogFactory.getLog(UdcShelfMarkSemanticRelationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UdcShelfMarkSemanticRelationIterator theUdcShelfMarkSemanticRelationIterator = (UdcShelfMarkSemanticRelationIterator)findAncestorWithClass(this, UdcShelfMarkSemanticRelationIterator.class);
			pageContext.getOut().print(theUdcShelfMarkSemanticRelationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing UdcShelfMark for semanticRelation tag ", e);
			throw new JspTagException("Error: Can't find enclosing UdcShelfMark for semanticRelation tag ");
		}
		return SKIP_BODY;
	}
}

