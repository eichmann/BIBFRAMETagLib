package edu.uiowa.slis.BIBFRAME.DatatypeProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatatypePropertyNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatatypePropertyNote currentInstance = null;
	private static final Log log = LogFactory.getLog(DatatypePropertyNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatatypePropertyNoteIterator theDatatypeProperty = (DatatypePropertyNoteIterator)findAncestorWithClass(this, DatatypePropertyNoteIterator.class);
			pageContext.getOut().print(theDatatypeProperty.getNote());
		} catch (Exception e) {
			log.error("Can't find enclosing DatatypeProperty for note tag ", e);
			throw new JspTagException("Error: Can't find enclosing DatatypeProperty for note tag ");
		}
		return SKIP_BODY;
	}
}

