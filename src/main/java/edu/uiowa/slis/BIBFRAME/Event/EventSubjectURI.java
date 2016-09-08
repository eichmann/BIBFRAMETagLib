package edu.uiowa.slis.BIBFRAME.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static EventSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(EventSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Event theEvent = (Event)findAncestorWithClass(this, Event.class);
			if (!theEvent.commitNeeded) {
				pageContext.getOut().print(theEvent.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Event for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Event theEvent = (Event)findAncestorWithClass(this, Event.class);
			return theEvent.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Event for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Event theEvent = (Event)findAncestorWithClass(this, Event.class);
			theEvent.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Event for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for subjectURI tag ");
		}
	}
}

