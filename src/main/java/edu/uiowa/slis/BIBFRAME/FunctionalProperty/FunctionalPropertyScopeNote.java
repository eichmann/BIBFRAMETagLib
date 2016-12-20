package edu.uiowa.slis.BIBFRAME.FunctionalProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FunctionalPropertyScopeNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FunctionalPropertyScopeNote currentInstance = null;
	private static final Log log = LogFactory.getLog(FunctionalPropertyScopeNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FunctionalPropertyScopeNoteIterator theFunctionalProperty = (FunctionalPropertyScopeNoteIterator)findAncestorWithClass(this, FunctionalPropertyScopeNoteIterator.class);
			pageContext.getOut().print(theFunctionalProperty.getScopeNote());
		} catch (Exception e) {
			log.error("Can't find enclosing FunctionalProperty for scopeNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing FunctionalProperty for scopeNote tag ");
		}
		return SKIP_BODY;
	}
}

