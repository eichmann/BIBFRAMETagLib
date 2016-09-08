package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourceContinuesUnderNewTitleType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourceContinuesUnderNewTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourceContinuesUnderNewTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourceContinuesUnderNewTitleIterator theContinuingResourceContinuesUnderNewTitleIterator = (ContinuingResourceContinuesUnderNewTitleIterator)findAncestorWithClass(this, ContinuingResourceContinuesUnderNewTitleIterator.class);
			pageContext.getOut().print(theContinuingResourceContinuesUnderNewTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for continuesUnderNewTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for continuesUnderNewTitle tag ");
		}
		return SKIP_BODY;
	}
}

