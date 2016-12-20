package edu.uiowa.slis.BIBFRAME.Property;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PropertyEditorialNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PropertyEditorialNote currentInstance = null;
	private static final Log log = LogFactory.getLog(PropertyEditorialNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PropertyEditorialNoteIterator theProperty = (PropertyEditorialNoteIterator)findAncestorWithClass(this, PropertyEditorialNoteIterator.class);
			pageContext.getOut().print(theProperty.getEditorialNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Property for editorialNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Property for editorialNote tag ");
		}
		return SKIP_BODY;
	}
}

