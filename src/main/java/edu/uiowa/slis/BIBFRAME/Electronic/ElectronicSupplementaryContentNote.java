package edu.uiowa.slis.BIBFRAME.Electronic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ElectronicSupplementaryContentNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ElectronicSupplementaryContentNote currentInstance = null;
	private static final Log log = LogFactory.getLog(ElectronicSupplementaryContentNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ElectronicSupplementaryContentNoteIterator theElectronic = (ElectronicSupplementaryContentNoteIterator)findAncestorWithClass(this, ElectronicSupplementaryContentNoteIterator.class);
			pageContext.getOut().print(theElectronic.getSupplementaryContentNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Electronic for supplementaryContentNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Electronic for supplementaryContentNote tag ");
		}
		return SKIP_BODY;
	}
}

