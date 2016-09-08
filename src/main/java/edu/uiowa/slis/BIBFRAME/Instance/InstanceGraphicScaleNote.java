package edu.uiowa.slis.BIBFRAME.Instance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstanceGraphicScaleNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static InstanceGraphicScaleNote currentInstance = null;
	private static final Log log = LogFactory.getLog(InstanceGraphicScaleNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			InstanceGraphicScaleNoteIterator theInstance = (InstanceGraphicScaleNoteIterator)findAncestorWithClass(this, InstanceGraphicScaleNoteIterator.class);
			pageContext.getOut().print(theInstance.getGraphicScaleNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Instance for graphicScaleNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Instance for graphicScaleNote tag ");
		}
		return SKIP_BODY;
	}
}

