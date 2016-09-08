package edu.uiowa.slis.BIBFRAME.Electronic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ElectronicAwardNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ElectronicAwardNote currentInstance = null;
	private static final Log log = LogFactory.getLog(ElectronicAwardNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ElectronicAwardNoteIterator theElectronic = (ElectronicAwardNoteIterator)findAncestorWithClass(this, ElectronicAwardNoteIterator.class);
			pageContext.getOut().print(theElectronic.getAwardNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Electronic for awardNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Electronic for awardNote tag ");
		}
		return SKIP_BODY;
	}
}

