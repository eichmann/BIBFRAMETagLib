package edu.uiowa.slis.BIBFRAME.Instance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstanceContentsNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static InstanceContentsNote currentInstance = null;
	private static final Log log = LogFactory.getLog(InstanceContentsNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			InstanceContentsNoteIterator theInstance = (InstanceContentsNoteIterator)findAncestorWithClass(this, InstanceContentsNoteIterator.class);
			pageContext.getOut().print(theInstance.getContentsNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Instance for contentsNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Instance for contentsNote tag ");
		}
		return SKIP_BODY;
	}
}

