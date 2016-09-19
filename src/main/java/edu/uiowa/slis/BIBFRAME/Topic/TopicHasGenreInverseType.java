package edu.uiowa.slis.BIBFRAME.Topic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TopicHasGenreInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TopicHasGenreInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(TopicHasGenreInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TopicHasGenreInverseIterator theTopicHasGenreInverseIterator = (TopicHasGenreInverseIterator)findAncestorWithClass(this, TopicHasGenreInverseIterator.class);
			pageContext.getOut().print(theTopicHasGenreInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Topic for hasGenre tag ", e);
			throw new JspTagException("Error: Can't find enclosing Topic for hasGenre tag ");
		}
		return SKIP_BODY;
	}
}

