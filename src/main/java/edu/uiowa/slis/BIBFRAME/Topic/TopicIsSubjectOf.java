package edu.uiowa.slis.BIBFRAME.Topic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TopicIsSubjectOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TopicIsSubjectOf currentInstance = null;
	private static final Log log = LogFactory.getLog(TopicIsSubjectOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TopicIsSubjectOfIterator theTopicIsSubjectOfIterator = (TopicIsSubjectOfIterator)findAncestorWithClass(this, TopicIsSubjectOfIterator.class);
			pageContext.getOut().print(theTopicIsSubjectOfIterator.getIsSubjectOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Topic for isSubjectOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Topic for isSubjectOf tag ");
		}
		return SKIP_BODY;
	}
}

