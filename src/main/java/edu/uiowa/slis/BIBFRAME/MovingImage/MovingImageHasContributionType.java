package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageHasContributionType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageHasContributionType currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageHasContributionType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImageHasContributionIterator theMovingImageHasContributionIterator = (MovingImageHasContributionIterator)findAncestorWithClass(this, MovingImageHasContributionIterator.class);
			pageContext.getOut().print(theMovingImageHasContributionIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for hasContribution tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for hasContribution tag ");
		}
		return SKIP_BODY;
	}
}

