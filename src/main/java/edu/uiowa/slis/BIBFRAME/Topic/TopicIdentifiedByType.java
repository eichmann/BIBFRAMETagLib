package edu.uiowa.slis.BIBFRAME.Topic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TopicIdentifiedByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TopicIdentifiedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(TopicIdentifiedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TopicIdentifiedByIterator theTopicIdentifiedByIterator = (TopicIdentifiedByIterator)findAncestorWithClass(this, TopicIdentifiedByIterator.class);
			pageContext.getOut().print(theTopicIdentifiedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Topic for identifiedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Topic for identifiedBy tag ");
		}
		return SKIP_BODY;
	}
}

