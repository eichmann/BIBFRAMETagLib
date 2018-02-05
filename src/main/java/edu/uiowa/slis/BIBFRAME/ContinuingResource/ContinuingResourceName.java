package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourceName extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourceName currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourceName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourceNameIterator theContinuingResource = (ContinuingResourceNameIterator)findAncestorWithClass(this, ContinuingResourceNameIterator.class);
			pageContext.getOut().print(theContinuingResource.getName());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for name tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for name tag ");
		}
		return SKIP_BODY;
	}
}

