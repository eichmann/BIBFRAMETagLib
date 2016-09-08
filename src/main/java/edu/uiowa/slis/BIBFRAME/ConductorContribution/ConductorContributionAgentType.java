package edu.uiowa.slis.BIBFRAME.ConductorContribution;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConductorContributionAgentType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ConductorContributionAgentType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConductorContributionAgentType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConductorContributionAgentIterator theConductorContributionAgentIterator = (ConductorContributionAgentIterator)findAncestorWithClass(this, ConductorContributionAgentIterator.class);
			pageContext.getOut().print(theConductorContributionAgentIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ConductorContribution for agent tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConductorContribution for agent tag ");
		}
		return SKIP_BODY;
	}
}

