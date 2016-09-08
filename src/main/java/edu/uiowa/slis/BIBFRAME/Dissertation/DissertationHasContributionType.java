package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationHasContributionType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationHasContributionType currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationHasContributionType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DissertationHasContributionIterator theDissertationHasContributionIterator = (DissertationHasContributionIterator)findAncestorWithClass(this, DissertationHasContributionIterator.class);
			pageContext.getOut().print(theDissertationHasContributionIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for hasContribution tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for hasContribution tag ");
		}
		return SKIP_BODY;
	}
}

