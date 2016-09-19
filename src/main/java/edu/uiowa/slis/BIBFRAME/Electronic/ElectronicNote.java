package edu.uiowa.slis.BIBFRAME.Electronic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ElectronicNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ElectronicNote currentInstance = null;
	private static final Log log = LogFactory.getLog(ElectronicNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ElectronicNoteIterator theElectronic = (ElectronicNoteIterator)findAncestorWithClass(this, ElectronicNoteIterator.class);
			pageContext.getOut().print(theElectronic.getNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Electronic for note tag ", e);
			throw new JspTagException("Error: Can't find enclosing Electronic for note tag ");
		}
		return SKIP_BODY;
	}
}

