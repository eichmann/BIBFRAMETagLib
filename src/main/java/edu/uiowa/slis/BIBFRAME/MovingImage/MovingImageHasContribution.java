package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageHasContribution extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageHasContribution currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageHasContribution.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImageHasContributionIterator theMovingImageHasContributionIterator = (MovingImageHasContributionIterator)findAncestorWithClass(this, MovingImageHasContributionIterator.class);
			pageContext.getOut().print(theMovingImageHasContributionIterator.getHasContribution());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for hasContribution tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for hasContribution tag ");
		}
		return SKIP_BODY;
	}
}

