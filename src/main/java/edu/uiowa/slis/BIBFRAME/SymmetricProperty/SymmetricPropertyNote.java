package edu.uiowa.slis.BIBFRAME.SymmetricProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SymmetricPropertyNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SymmetricPropertyNote currentInstance = null;
	private static final Log log = LogFactory.getLog(SymmetricPropertyNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SymmetricPropertyNoteIterator theSymmetricProperty = (SymmetricPropertyNoteIterator)findAncestorWithClass(this, SymmetricPropertyNoteIterator.class);
			pageContext.getOut().print(theSymmetricProperty.getNote());
		} catch (Exception e) {
			log.error("Can't find enclosing SymmetricProperty for note tag ", e);
			throw new JspTagException("Error: Can't find enclosing SymmetricProperty for note tag ");
		}
		return SKIP_BODY;
	}
}

