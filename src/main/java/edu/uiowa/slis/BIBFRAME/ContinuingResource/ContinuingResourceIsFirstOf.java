package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourceIsFirstOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourceIsFirstOf currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourceIsFirstOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourceIsFirstOfIterator theContinuingResourceIsFirstOfIterator = (ContinuingResourceIsFirstOfIterator)findAncestorWithClass(this, ContinuingResourceIsFirstOfIterator.class);
			pageContext.getOut().print(theContinuingResourceIsFirstOfIterator.getIsFirstOf());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for isFirstOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for isFirstOf tag ");
		}
		return SKIP_BODY;
	}
}

