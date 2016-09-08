package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourceContinuesUnderNewTitle extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourceContinuesUnderNewTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourceContinuesUnderNewTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourceContinuesUnderNewTitleIterator theContinuingResourceContinuesUnderNewTitleIterator = (ContinuingResourceContinuesUnderNewTitleIterator)findAncestorWithClass(this, ContinuingResourceContinuesUnderNewTitleIterator.class);
			pageContext.getOut().print(theContinuingResourceContinuesUnderNewTitleIterator.getContinuesUnderNewTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for continuesUnderNewTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for continuesUnderNewTitle tag ");
		}
		return SKIP_BODY;
	}
}

