package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourceHasContributionType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourceHasContributionType currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourceHasContributionType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourceHasContributionIterator theIntegratingResourceHasContributionIterator = (IntegratingResourceHasContributionIterator)findAncestorWithClass(this, IntegratingResourceHasContributionIterator.class);
			pageContext.getOut().print(theIntegratingResourceHasContributionIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for hasContribution tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for hasContribution tag ");
		}
		return SKIP_BODY;
	}
}

