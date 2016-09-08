package edu.uiowa.slis.BIBFRAME.Instance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstanceResponsibilityNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static InstanceResponsibilityNote currentInstance = null;
	private static final Log log = LogFactory.getLog(InstanceResponsibilityNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			InstanceResponsibilityNoteIterator theInstance = (InstanceResponsibilityNoteIterator)findAncestorWithClass(this, InstanceResponsibilityNoteIterator.class);
			pageContext.getOut().print(theInstance.getResponsibilityNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Instance for responsibilityNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Instance for responsibilityNote tag ");
		}
		return SKIP_BODY;
	}
}

