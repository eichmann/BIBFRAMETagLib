package edu.uiowa.slis.BIBFRAME.NarratorContribution;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NarratorContributionContributedToType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NarratorContributionContributedToType currentInstance = null;
	private static final Log log = LogFactory.getLog(NarratorContributionContributedToType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NarratorContributionContributedToIterator theNarratorContributionContributedToIterator = (NarratorContributionContributedToIterator)findAncestorWithClass(this, NarratorContributionContributedToIterator.class);
			pageContext.getOut().print(theNarratorContributionContributedToIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NarratorContribution for contributedTo tag ", e);
			throw new JspTagException("Error: Can't find enclosing NarratorContribution for contributedTo tag ");
		}
		return SKIP_BODY;
	}
}

