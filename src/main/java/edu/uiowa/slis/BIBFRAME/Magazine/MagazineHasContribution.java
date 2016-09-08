package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineHasContribution extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineHasContribution currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineHasContribution.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineHasContributionIterator theMagazineHasContributionIterator = (MagazineHasContributionIterator)findAncestorWithClass(this, MagazineHasContributionIterator.class);
			pageContext.getOut().print(theMagazineHasContributionIterator.getHasContribution());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for hasContribution tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for hasContribution tag ");
		}
		return SKIP_BODY;
	}
}

