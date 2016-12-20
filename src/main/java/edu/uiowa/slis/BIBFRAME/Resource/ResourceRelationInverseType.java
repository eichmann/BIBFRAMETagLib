package edu.uiowa.slis.BIBFRAME.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResourceRelationInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ResourceRelationInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ResourceRelationInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResourceRelationInverseIterator theResourceRelationInverseIterator = (ResourceRelationInverseIterator)findAncestorWithClass(this, ResourceRelationInverseIterator.class);
			pageContext.getOut().print(theResourceRelationInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Resource for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Resource for relation tag ");
		}
		return SKIP_BODY;
	}
}

