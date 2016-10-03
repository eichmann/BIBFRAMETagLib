package edu.uiowa.slis.BIBFRAME.Motivation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MotivationSemanticRelationInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MotivationSemanticRelationInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(MotivationSemanticRelationInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MotivationSemanticRelationInverseIterator theMotivationSemanticRelationInverseIterator = (MotivationSemanticRelationInverseIterator)findAncestorWithClass(this, MotivationSemanticRelationInverseIterator.class);
			pageContext.getOut().print(theMotivationSemanticRelationInverseIterator.getSemanticRelationInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Motivation for semanticRelation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Motivation for semanticRelation tag ");
		}
		return SKIP_BODY;
	}
}

