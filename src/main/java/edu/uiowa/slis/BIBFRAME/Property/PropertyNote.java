package edu.uiowa.slis.BIBFRAME.Property;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PropertyNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PropertyNote currentInstance = null;
	private static final Log log = LogFactory.getLog(PropertyNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PropertyNoteIterator theProperty = (PropertyNoteIterator)findAncestorWithClass(this, PropertyNoteIterator.class);
			pageContext.getOut().print(theProperty.getNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Property for note tag ", e);
			throw new JspTagException("Error: Can't find enclosing Property for note tag ");
		}
		return SKIP_BODY;
	}
}

