package edu.uiowa.slis.BIBFRAME.Topic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TopicSemanticRelation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TopicSemanticRelation currentInstance = null;
	private static final Log log = LogFactory.getLog(TopicSemanticRelation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TopicSemanticRelationIterator theTopicSemanticRelationIterator = (TopicSemanticRelationIterator)findAncestorWithClass(this, TopicSemanticRelationIterator.class);
			pageContext.getOut().print(theTopicSemanticRelationIterator.getSemanticRelation());
		} catch (Exception e) {
			log.error("Can't find enclosing Topic for semanticRelation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Topic for semanticRelation tag ");
		}
		return SKIP_BODY;
	}
}

