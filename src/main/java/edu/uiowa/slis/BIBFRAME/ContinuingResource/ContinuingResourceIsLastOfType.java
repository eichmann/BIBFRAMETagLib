package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourceIsLastOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourceIsLastOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourceIsLastOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourceIsLastOfIterator theContinuingResourceIsLastOfIterator = (ContinuingResourceIsLastOfIterator)findAncestorWithClass(this, ContinuingResourceIsLastOfIterator.class);
			pageContext.getOut().print(theContinuingResourceIsLastOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for isLastOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for isLastOf tag ");
		}
		return SKIP_BODY;
	}
}

