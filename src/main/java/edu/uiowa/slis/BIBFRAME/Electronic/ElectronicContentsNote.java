package edu.uiowa.slis.BIBFRAME.Electronic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ElectronicContentsNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ElectronicContentsNote currentInstance = null;
	private static final Log log = LogFactory.getLog(ElectronicContentsNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ElectronicContentsNoteIterator theElectronic = (ElectronicContentsNoteIterator)findAncestorWithClass(this, ElectronicContentsNoteIterator.class);
			pageContext.getOut().print(theElectronic.getContentsNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Electronic for contentsNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Electronic for contentsNote tag ");
		}
		return SKIP_BODY;
	}
}

