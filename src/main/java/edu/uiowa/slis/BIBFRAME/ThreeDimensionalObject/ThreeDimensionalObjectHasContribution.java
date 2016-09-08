package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectHasContribution extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectHasContribution currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectHasContribution.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectHasContributionIterator theThreeDimensionalObjectHasContributionIterator = (ThreeDimensionalObjectHasContributionIterator)findAncestorWithClass(this, ThreeDimensionalObjectHasContributionIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectHasContributionIterator.getHasContribution());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for hasContribution tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for hasContribution tag ");
		}
		return SKIP_BODY;
	}
}

