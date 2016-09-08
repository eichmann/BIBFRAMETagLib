package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaHasContribution extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaHasContribution currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaHasContribution.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaHasContributionIterator theMultimediaHasContributionIterator = (MultimediaHasContributionIterator)findAncestorWithClass(this, MultimediaHasContributionIterator.class);
			pageContext.getOut().print(theMultimediaHasContributionIterator.getHasContribution());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for hasContribution tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for hasContribution tag ");
		}
		return SKIP_BODY;
	}
}

