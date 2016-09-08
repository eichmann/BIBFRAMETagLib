package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourceContinuedUnderNewTitleByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourceContinuedUnderNewTitleByType currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourceContinuedUnderNewTitleByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourceContinuedUnderNewTitleByIterator theContinuingResourceContinuedUnderNewTitleByIterator = (ContinuingResourceContinuedUnderNewTitleByIterator)findAncestorWithClass(this, ContinuingResourceContinuedUnderNewTitleByIterator.class);
			pageContext.getOut().print(theContinuingResourceContinuedUnderNewTitleByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for continuedUnderNewTitleBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for continuedUnderNewTitleBy tag ");
		}
		return SKIP_BODY;
	}
}

