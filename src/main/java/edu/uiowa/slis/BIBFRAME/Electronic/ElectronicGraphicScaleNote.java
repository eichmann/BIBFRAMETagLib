package edu.uiowa.slis.BIBFRAME.Electronic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ElectronicGraphicScaleNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ElectronicGraphicScaleNote currentInstance = null;
	private static final Log log = LogFactory.getLog(ElectronicGraphicScaleNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ElectronicGraphicScaleNoteIterator theElectronic = (ElectronicGraphicScaleNoteIterator)findAncestorWithClass(this, ElectronicGraphicScaleNoteIterator.class);
			pageContext.getOut().print(theElectronic.getGraphicScaleNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Electronic for graphicScaleNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Electronic for graphicScaleNote tag ");
		}
		return SKIP_BODY;
	}
}

