package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourceSeparatedIntoType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourceSeparatedIntoType currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourceSeparatedIntoType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourceSeparatedIntoIterator theContinuingResourceSeparatedIntoIterator = (ContinuingResourceSeparatedIntoIterator)findAncestorWithClass(this, ContinuingResourceSeparatedIntoIterator.class);
			pageContext.getOut().print(theContinuingResourceSeparatedIntoIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for separatedInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for separatedInto tag ");
		}
		return SKIP_BODY;
	}
}

