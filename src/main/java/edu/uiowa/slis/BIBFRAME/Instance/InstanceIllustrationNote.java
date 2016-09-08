package edu.uiowa.slis.BIBFRAME.Instance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstanceIllustrationNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static InstanceIllustrationNote currentInstance = null;
	private static final Log log = LogFactory.getLog(InstanceIllustrationNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			InstanceIllustrationNoteIterator theInstance = (InstanceIllustrationNoteIterator)findAncestorWithClass(this, InstanceIllustrationNoteIterator.class);
			pageContext.getOut().print(theInstance.getIllustrationNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Instance for illustrationNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Instance for illustrationNote tag ");
		}
		return SKIP_BODY;
	}
}

