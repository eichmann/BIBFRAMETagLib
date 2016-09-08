package edu.uiowa.slis.BIBFRAME.ComposerContribution;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ComposerContributionAgentType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ComposerContributionAgentType currentInstance = null;
	private static final Log log = LogFactory.getLog(ComposerContributionAgentType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ComposerContributionAgentIterator theComposerContributionAgentIterator = (ComposerContributionAgentIterator)findAncestorWithClass(this, ComposerContributionAgentIterator.class);
			pageContext.getOut().print(theComposerContributionAgentIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ComposerContribution for agent tag ", e);
			throw new JspTagException("Error: Can't find enclosing ComposerContribution for agent tag ");
		}
		return SKIP_BODY;
	}
}

