package edu.uiowa.slis.BIBFRAME.Topic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TopicTopConceptOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TopicTopConceptOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(TopicTopConceptOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TopicTopConceptOfIterator theTopicTopConceptOfIterator = (TopicTopConceptOfIterator)findAncestorWithClass(this, TopicTopConceptOfIterator.class);
			pageContext.getOut().print(theTopicTopConceptOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Topic for topConceptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Topic for topConceptOf tag ");
		}
		return SKIP_BODY;
	}
}

