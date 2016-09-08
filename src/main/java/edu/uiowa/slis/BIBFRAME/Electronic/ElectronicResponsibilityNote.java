package edu.uiowa.slis.BIBFRAME.Electronic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ElectronicResponsibilityNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ElectronicResponsibilityNote currentInstance = null;
	private static final Log log = LogFactory.getLog(ElectronicResponsibilityNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ElectronicResponsibilityNoteIterator theElectronic = (ElectronicResponsibilityNoteIterator)findAncestorWithClass(this, ElectronicResponsibilityNoteIterator.class);
			pageContext.getOut().print(theElectronic.getResponsibilityNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Electronic for responsibilityNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Electronic for responsibilityNote tag ");
		}
		return SKIP_BODY;
	}
}

