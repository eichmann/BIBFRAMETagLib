package edu.uiowa.slis.BIBFRAME.PerformerContribution;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PerformerContributionAgentType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PerformerContributionAgentType currentInstance = null;
	private static final Log log = LogFactory.getLog(PerformerContributionAgentType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PerformerContributionAgentIterator thePerformerContributionAgentIterator = (PerformerContributionAgentIterator)findAncestorWithClass(this, PerformerContributionAgentIterator.class);
			pageContext.getOut().print(thePerformerContributionAgentIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PerformerContribution for agent tag ", e);
			throw new JspTagException("Error: Can't find enclosing PerformerContribution for agent tag ");
		}
		return SKIP_BODY;
	}
}

