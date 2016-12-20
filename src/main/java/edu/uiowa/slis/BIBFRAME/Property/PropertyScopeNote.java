package edu.uiowa.slis.BIBFRAME.Property;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PropertyScopeNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PropertyScopeNote currentInstance = null;
	private static final Log log = LogFactory.getLog(PropertyScopeNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PropertyScopeNoteIterator theProperty = (PropertyScopeNoteIterator)findAncestorWithClass(this, PropertyScopeNoteIterator.class);
			pageContext.getOut().print(theProperty.getScopeNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Property for scopeNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Property for scopeNote tag ");
		}
		return SKIP_BODY;
	}
}

