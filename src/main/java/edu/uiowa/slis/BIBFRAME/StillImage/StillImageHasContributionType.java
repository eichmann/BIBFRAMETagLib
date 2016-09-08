package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageHasContributionType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageHasContributionType currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageHasContributionType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImageHasContributionIterator theStillImageHasContributionIterator = (StillImageHasContributionIterator)findAncestorWithClass(this, StillImageHasContributionIterator.class);
			pageContext.getOut().print(theStillImageHasContributionIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for hasContribution tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for hasContribution tag ");
		}
		return SKIP_BODY;
	}
}

