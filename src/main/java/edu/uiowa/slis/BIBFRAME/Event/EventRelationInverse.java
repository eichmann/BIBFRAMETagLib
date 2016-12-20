package edu.uiowa.slis.BIBFRAME.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventRelationInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static EventRelationInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(EventRelationInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EventRelationInverseIterator theEventRelationInverseIterator = (EventRelationInverseIterator)findAncestorWithClass(this, EventRelationInverseIterator.class);
			pageContext.getOut().print(theEventRelationInverseIterator.getRelationInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for relation tag ");
		}
		return SKIP_BODY;
	}
}

