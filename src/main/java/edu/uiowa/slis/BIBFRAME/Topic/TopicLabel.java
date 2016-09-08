package edu.uiowa.slis.BIBFRAME.Topic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TopicLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TopicLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(TopicLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Topic theTopic = (Topic)findAncestorWithClass(this, Topic.class);
			if (!theTopic.commitNeeded) {
				pageContext.getOut().print(theTopic.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Topic for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Topic for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Topic theTopic = (Topic)findAncestorWithClass(this, Topic.class);
			return theTopic.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Topic for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Topic for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Topic theTopic = (Topic)findAncestorWithClass(this, Topic.class);
			theTopic.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Topic for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Topic for label tag ");
		}
	}
}

