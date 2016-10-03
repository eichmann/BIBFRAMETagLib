package edu.uiowa.slis.BIBFRAME.Topic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TopicMemberInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TopicMemberInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(TopicMemberInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TopicMemberInverseIterator theTopicMemberInverseIterator = (TopicMemberInverseIterator)findAncestorWithClass(this, TopicMemberInverseIterator.class);
			pageContext.getOut().print(theTopicMemberInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Topic for member tag ", e);
			throw new JspTagException("Error: Can't find enclosing Topic for member tag ");
		}
		return SKIP_BODY;
	}
}

