package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceHasContributionType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceHasContributionType currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceHasContributionType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FiniteResourceHasContributionIterator theFiniteResourceHasContributionIterator = (FiniteResourceHasContributionIterator)findAncestorWithClass(this, FiniteResourceHasContributionIterator.class);
			pageContext.getOut().print(theFiniteResourceHasContributionIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for hasContribution tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for hasContribution tag ");
		}
		return SKIP_BODY;
	}
}

