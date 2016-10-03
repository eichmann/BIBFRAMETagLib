package edu.uiowa.slis.BIBFRAME.Motivation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MotivationSemanticRelationInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MotivationSemanticRelationInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(MotivationSemanticRelationInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MotivationSemanticRelationInverseIterator theMotivationSemanticRelationInverseIterator = (MotivationSemanticRelationInverseIterator)findAncestorWithClass(this, MotivationSemanticRelationInverseIterator.class);
			pageContext.getOut().print(theMotivationSemanticRelationInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Motivation for semanticRelation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Motivation for semanticRelation tag ");
		}
		return SKIP_BODY;
	}
}

