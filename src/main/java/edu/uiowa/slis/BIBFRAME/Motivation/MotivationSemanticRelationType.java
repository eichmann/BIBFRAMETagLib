package edu.uiowa.slis.BIBFRAME.Motivation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MotivationSemanticRelationType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MotivationSemanticRelationType currentInstance = null;
	private static final Log log = LogFactory.getLog(MotivationSemanticRelationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MotivationSemanticRelationIterator theMotivationSemanticRelationIterator = (MotivationSemanticRelationIterator)findAncestorWithClass(this, MotivationSemanticRelationIterator.class);
			pageContext.getOut().print(theMotivationSemanticRelationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Motivation for semanticRelation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Motivation for semanticRelation tag ");
		}
		return SKIP_BODY;
	}
}

