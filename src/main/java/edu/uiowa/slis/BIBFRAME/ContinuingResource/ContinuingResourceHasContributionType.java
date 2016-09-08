package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourceHasContributionType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourceHasContributionType currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourceHasContributionType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourceHasContributionIterator theContinuingResourceHasContributionIterator = (ContinuingResourceHasContributionIterator)findAncestorWithClass(this, ContinuingResourceHasContributionIterator.class);
			pageContext.getOut().print(theContinuingResourceHasContributionIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for hasContribution tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for hasContribution tag ");
		}
		return SKIP_BODY;
	}
}

