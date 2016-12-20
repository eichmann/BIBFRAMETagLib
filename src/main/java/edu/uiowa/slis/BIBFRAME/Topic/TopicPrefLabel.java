package edu.uiowa.slis.BIBFRAME.Topic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TopicPrefLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TopicPrefLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(TopicPrefLabel.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TopicPrefLabelIterator theTopic = (TopicPrefLabelIterator)findAncestorWithClass(this, TopicPrefLabelIterator.class);
			pageContext.getOut().print(theTopic.getPrefLabel());
		} catch (Exception e) {
			log.error("Can't find enclosing Topic for prefLabel tag ", e);
			throw new JspTagException("Error: Can't find enclosing Topic for prefLabel tag ");
		}
		return SKIP_BODY;
	}
}

