package edu.uiowa.slis.BIBFRAME.ConductorContribution;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConductorContributionAgent extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ConductorContributionAgent currentInstance = null;
	private static final Log log = LogFactory.getLog(ConductorContributionAgent.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConductorContributionAgentIterator theConductorContributionAgentIterator = (ConductorContributionAgentIterator)findAncestorWithClass(this, ConductorContributionAgentIterator.class);
			pageContext.getOut().print(theConductorContributionAgentIterator.getAgent());
		} catch (Exception e) {
			log.error("Can't find enclosing ConductorContribution for agent tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConductorContribution for agent tag ");
		}
		return SKIP_BODY;
	}
}

