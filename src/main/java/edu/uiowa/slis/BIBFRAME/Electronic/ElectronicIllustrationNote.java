package edu.uiowa.slis.BIBFRAME.Electronic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ElectronicIllustrationNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ElectronicIllustrationNote currentInstance = null;
	private static final Log log = LogFactory.getLog(ElectronicIllustrationNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ElectronicIllustrationNoteIterator theElectronic = (ElectronicIllustrationNoteIterator)findAncestorWithClass(this, ElectronicIllustrationNoteIterator.class);
			pageContext.getOut().print(theElectronic.getIllustrationNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Electronic for illustrationNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Electronic for illustrationNote tag ");
		}
		return SKIP_BODY;
	}
}

