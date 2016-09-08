package edu.uiowa.slis.BIBFRAME.Topic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TopicSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TopicSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(TopicSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Topic theTopic = (Topic)findAncestorWithClass(this, Topic.class);
			if (!theTopic.commitNeeded) {
				pageContext.getOut().print(theTopic.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Topic for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Topic for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Topic theTopic = (Topic)findAncestorWithClass(this, Topic.class);
			return theTopic.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Topic for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Topic for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Topic theTopic = (Topic)findAncestorWithClass(this, Topic.class);
			theTopic.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Topic for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Topic for subjectURI tag ");
		}
	}
}

