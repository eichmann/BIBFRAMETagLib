package edu.uiowa.slis.BIBFRAME.NarratorContribution;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NarratorContributionContributedTo extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NarratorContributionContributedTo currentInstance = null;
	private static final Log log = LogFactory.getLog(NarratorContributionContributedTo.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NarratorContributionContributedToIterator theNarratorContributionContributedToIterator = (NarratorContributionContributedToIterator)findAncestorWithClass(this, NarratorContributionContributedToIterator.class);
			pageContext.getOut().print(theNarratorContributionContributedToIterator.getContributedTo());
		} catch (Exception e) {
			log.error("Can't find enclosing NarratorContribution for contributedTo tag ", e);
			throw new JspTagException("Error: Can't find enclosing NarratorContribution for contributedTo tag ");
		}
		return SKIP_BODY;
	}
}

