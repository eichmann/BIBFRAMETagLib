package edu.uiowa.slis.BIBFRAME.Instance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstanceSupplementaryContentNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static InstanceSupplementaryContentNote currentInstance = null;
	private static final Log log = LogFactory.getLog(InstanceSupplementaryContentNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			InstanceSupplementaryContentNoteIterator theInstance = (InstanceSupplementaryContentNoteIterator)findAncestorWithClass(this, InstanceSupplementaryContentNoteIterator.class);
			pageContext.getOut().print(theInstance.getSupplementaryContentNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Instance for supplementaryContentNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Instance for supplementaryContentNote tag ");
		}
		return SKIP_BODY;
	}
}

