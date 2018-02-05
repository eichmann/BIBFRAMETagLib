package edu.uiowa.slis.BIBFRAME.Topic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TopicName extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TopicName currentInstance = null;
	private static final Log log = LogFactory.getLog(TopicName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TopicNameIterator theTopic = (TopicNameIterator)findAncestorWithClass(this, TopicNameIterator.class);
			pageContext.getOut().print(theTopic.getName());
		} catch (Exception e) {
			log.error("Can't find enclosing Topic for name tag ", e);
			throw new JspTagException("Error: Can't find enclosing Topic for name tag ");
		}
		return SKIP_BODY;
	}
}

