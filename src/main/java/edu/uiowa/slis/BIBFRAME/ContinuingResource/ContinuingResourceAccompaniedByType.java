package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourceAccompaniedByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourceAccompaniedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourceAccompaniedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourceAccompaniedByIterator theContinuingResourceAccompaniedByIterator = (ContinuingResourceAccompaniedByIterator)findAncestorWithClass(this, ContinuingResourceAccompaniedByIterator.class);
			pageContext.getOut().print(theContinuingResourceAccompaniedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for accompaniedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for accompaniedBy tag ");
		}
		return SKIP_BODY;
	}
}

