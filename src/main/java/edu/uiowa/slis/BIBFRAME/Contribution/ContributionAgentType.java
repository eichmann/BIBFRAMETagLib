package edu.uiowa.slis.BIBFRAME.Contribution;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContributionAgentType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContributionAgentType currentInstance = null;
	private static final Log log = LogFactory.getLog(ContributionAgentType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContributionAgentIterator theContributionAgentIterator = (ContributionAgentIterator)findAncestorWithClass(this, ContributionAgentIterator.class);
			pageContext.getOut().print(theContributionAgentIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Contribution for agent tag ", e);
			throw new JspTagException("Error: Can't find enclosing Contribution for agent tag ");
		}
		return SKIP_BODY;
	}
}

