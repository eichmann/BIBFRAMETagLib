package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourceTranslates extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourceTranslates currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourceTranslates.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourceTranslatesIterator theContinuingResourceTranslatesIterator = (ContinuingResourceTranslatesIterator)findAncestorWithClass(this, ContinuingResourceTranslatesIterator.class);
			pageContext.getOut().print(theContinuingResourceTranslatesIterator.getTranslates());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for translates tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for translates tag ");
		}
		return SKIP_BODY;
	}
}

