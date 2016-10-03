package edu.uiowa.slis.BIBFRAME.UdcShelfMark;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UdcShelfMarkSemanticRelationInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static UdcShelfMarkSemanticRelationInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(UdcShelfMarkSemanticRelationInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UdcShelfMarkSemanticRelationInverseIterator theUdcShelfMarkSemanticRelationInverseIterator = (UdcShelfMarkSemanticRelationInverseIterator)findAncestorWithClass(this, UdcShelfMarkSemanticRelationInverseIterator.class);
			pageContext.getOut().print(theUdcShelfMarkSemanticRelationInverseIterator.getSemanticRelationInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing UdcShelfMark for semanticRelation tag ", e);
			throw new JspTagException("Error: Can't find enclosing UdcShelfMark for semanticRelation tag ");
		}
		return SKIP_BODY;
	}
}

