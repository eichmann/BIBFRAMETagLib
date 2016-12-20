package edu.uiowa.slis.BIBFRAME.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResourceNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ResourceNote currentInstance = null;
	private static final Log log = LogFactory.getLog(ResourceNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResourceNoteIterator theResource = (ResourceNoteIterator)findAncestorWithClass(this, ResourceNoteIterator.class);
			pageContext.getOut().print(theResource.getNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Resource for note tag ", e);
			throw new JspTagException("Error: Can't find enclosing Resource for note tag ");
		}
		return SKIP_BODY;
	}
}

