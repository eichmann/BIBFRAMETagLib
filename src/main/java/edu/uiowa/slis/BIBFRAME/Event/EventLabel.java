package edu.uiowa.slis.BIBFRAME.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static EventLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(EventLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Event theEvent = (Event)findAncestorWithClass(this, Event.class);
			if (!theEvent.commitNeeded) {
				pageContext.getOut().print(theEvent.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Event for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Event theEvent = (Event)findAncestorWithClass(this, Event.class);
			return theEvent.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Event for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Event theEvent = (Event)findAncestorWithClass(this, Event.class);
			theEvent.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Event for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for label tag ");
		}
	}
}

