package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourceSplitIntoType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourceSplitIntoType currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourceSplitIntoType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourceSplitIntoIterator theContinuingResourceSplitIntoIterator = (ContinuingResourceSplitIntoIterator)findAncestorWithClass(this, ContinuingResourceSplitIntoIterator.class);
			pageContext.getOut().print(theContinuingResourceSplitIntoIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for splitInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for splitInto tag ");
		}
		return SKIP_BODY;
	}
}

