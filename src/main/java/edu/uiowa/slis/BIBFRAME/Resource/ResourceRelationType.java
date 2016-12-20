package edu.uiowa.slis.BIBFRAME.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResourceRelationType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ResourceRelationType currentInstance = null;
	private static final Log log = LogFactory.getLog(ResourceRelationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResourceRelationIterator theResourceRelationIterator = (ResourceRelationIterator)findAncestorWithClass(this, ResourceRelationIterator.class);
			pageContext.getOut().print(theResourceRelationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Resource for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Resource for relation tag ");
		}
		return SKIP_BODY;
	}
}
