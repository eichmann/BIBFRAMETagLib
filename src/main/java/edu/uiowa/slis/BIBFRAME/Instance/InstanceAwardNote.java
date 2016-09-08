package edu.uiowa.slis.BIBFRAME.Instance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstanceAwardNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static InstanceAwardNote currentInstance = null;
	private static final Log log = LogFactory.getLog(InstanceAwardNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			InstanceAwardNoteIterator theInstance = (InstanceAwardNoteIterator)findAncestorWithClass(this, InstanceAwardNoteIterator.class);
			pageContext.getOut().print(theInstance.getAwardNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Instance for awardNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Instance for awardNote tag ");
		}
		return SKIP_BODY;
	}
}

