package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourceSupersedes extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourceSupersedes currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourceSupersedes.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourceSupersedesIterator theContinuingResourceSupersedesIterator = (ContinuingResourceSupersedesIterator)findAncestorWithClass(this, ContinuingResourceSupersedesIterator.class);
			pageContext.getOut().print(theContinuingResourceSupersedesIterator.getSupersedes());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for supersedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for supersedes tag ");
		}
		return SKIP_BODY;
	}
}

