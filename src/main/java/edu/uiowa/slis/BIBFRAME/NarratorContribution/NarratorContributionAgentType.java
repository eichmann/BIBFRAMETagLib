package edu.uiowa.slis.BIBFRAME.NarratorContribution;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NarratorContributionAgentType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NarratorContributionAgentType currentInstance = null;
	private static final Log log = LogFactory.getLog(NarratorContributionAgentType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NarratorContributionAgentIterator theNarratorContributionAgentIterator = (NarratorContributionAgentIterator)findAncestorWithClass(this, NarratorContributionAgentIterator.class);
			pageContext.getOut().print(theNarratorContributionAgentIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NarratorContribution for agent tag ", e);
			throw new JspTagException("Error: Can't find enclosing NarratorContribution for agent tag ");
		}
		return SKIP_BODY;
	}
}

