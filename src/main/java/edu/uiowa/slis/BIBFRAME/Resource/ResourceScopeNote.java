package edu.uiowa.slis.BIBFRAME.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResourceScopeNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ResourceScopeNote currentInstance = null;
	private static final Log log = LogFactory.getLog(ResourceScopeNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResourceScopeNoteIterator theResource = (ResourceScopeNoteIterator)findAncestorWithClass(this, ResourceScopeNoteIterator.class);
			pageContext.getOut().print(theResource.getScopeNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Resource for scopeNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Resource for scopeNote tag ");
		}
		return SKIP_BODY;
	}
}

