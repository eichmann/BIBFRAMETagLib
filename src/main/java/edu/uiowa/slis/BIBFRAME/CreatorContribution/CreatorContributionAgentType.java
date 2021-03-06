package edu.uiowa.slis.BIBFRAME.CreatorContribution;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CreatorContributionAgentType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CreatorContributionAgentType currentInstance = null;
	private static final Log log = LogFactory.getLog(CreatorContributionAgentType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CreatorContributionAgentIterator theCreatorContributionAgentIterator = (CreatorContributionAgentIterator)findAncestorWithClass(this, CreatorContributionAgentIterator.class);
			pageContext.getOut().print(theCreatorContributionAgentIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CreatorContribution for agent tag ", e);
			throw new JspTagException("Error: Can't find enclosing CreatorContribution for agent tag ");
		}
		return SKIP_BODY;
	}
}

