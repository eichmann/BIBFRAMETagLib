package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourceHasInstance extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourceHasInstance currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourceHasInstance.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourceHasInstanceIterator theContinuingResourceHasInstanceIterator = (ContinuingResourceHasInstanceIterator)findAncestorWithClass(this, ContinuingResourceHasInstanceIterator.class);
			pageContext.getOut().print(theContinuingResourceHasInstanceIterator.getHasInstance());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for hasInstance tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for hasInstance tag ");
		}
		return SKIP_BODY;
	}
}

