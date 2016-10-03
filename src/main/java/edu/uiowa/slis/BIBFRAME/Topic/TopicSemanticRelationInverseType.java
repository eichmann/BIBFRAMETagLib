package edu.uiowa.slis.BIBFRAME.Topic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TopicSemanticRelationInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TopicSemanticRelationInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(TopicSemanticRelationInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TopicSemanticRelationInverseIterator theTopicSemanticRelationInverseIterator = (TopicSemanticRelationInverseIterator)findAncestorWithClass(this, TopicSemanticRelationInverseIterator.class);
			pageContext.getOut().print(theTopicSemanticRelationInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Topic for semanticRelation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Topic for semanticRelation tag ");
		}
		return SKIP_BODY;
	}
}

