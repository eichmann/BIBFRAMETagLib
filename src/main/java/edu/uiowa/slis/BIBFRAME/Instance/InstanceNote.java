package edu.uiowa.slis.BIBFRAME.Instance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstanceNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static InstanceNote currentInstance = null;
	private static final Log log = LogFactory.getLog(InstanceNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			InstanceNoteIterator theInstance = (InstanceNoteIterator)findAncestorWithClass(this, InstanceNoteIterator.class);
			pageContext.getOut().print(theInstance.getNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Instance for note tag ", e);
			throw new JspTagException("Error: Can't find enclosing Instance for note tag ");
		}
		return SKIP_BODY;
	}
}

