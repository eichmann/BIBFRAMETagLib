package edu.uiowa.slis.BIBFRAME.DatatypeProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatatypePropertyScopeNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatatypePropertyScopeNote currentInstance = null;
	private static final Log log = LogFactory.getLog(DatatypePropertyScopeNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatatypePropertyScopeNoteIterator theDatatypeProperty = (DatatypePropertyScopeNoteIterator)findAncestorWithClass(this, DatatypePropertyScopeNoteIterator.class);
			pageContext.getOut().print(theDatatypeProperty.getScopeNote());
		} catch (Exception e) {
			log.error("Can't find enclosing DatatypeProperty for scopeNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing DatatypeProperty for scopeNote tag ");
		}
		return SKIP_BODY;
	}
}

