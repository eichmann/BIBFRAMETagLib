package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourceSupersededBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourceSupersededBy currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourceSupersededBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourceSupersededByIterator theContinuingResourceSupersededByIterator = (ContinuingResourceSupersededByIterator)findAncestorWithClass(this, ContinuingResourceSupersededByIterator.class);
			pageContext.getOut().print(theContinuingResourceSupersededByIterator.getSupersededBy());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for supersededBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for supersededBy tag ");
		}
		return SKIP_BODY;
	}
}

