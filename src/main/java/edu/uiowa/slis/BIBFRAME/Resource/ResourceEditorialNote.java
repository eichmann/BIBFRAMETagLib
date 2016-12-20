package edu.uiowa.slis.BIBFRAME.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResourceEditorialNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ResourceEditorialNote currentInstance = null;
	private static final Log log = LogFactory.getLog(ResourceEditorialNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResourceEditorialNoteIterator theResource = (ResourceEditorialNoteIterator)findAncestorWithClass(this, ResourceEditorialNoteIterator.class);
			pageContext.getOut().print(theResource.getEditorialNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Resource for editorialNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Resource for editorialNote tag ");
		}
		return SKIP_BODY;
	}
}

