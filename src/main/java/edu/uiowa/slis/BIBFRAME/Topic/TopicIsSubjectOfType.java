package edu.uiowa.slis.BIBFRAME.Topic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TopicIsSubjectOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TopicIsSubjectOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(TopicIsSubjectOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TopicIsSubjectOfIterator theTopicIsSubjectOfIterator = (TopicIsSubjectOfIterator)findAncestorWithClass(this, TopicIsSubjectOfIterator.class);
			pageContext.getOut().print(theTopicIsSubjectOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Topic for isSubjectOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Topic for isSubjectOf tag ");
		}
		return SKIP_BODY;
	}
}

