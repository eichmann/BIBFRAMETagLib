package edu.uiowa.slis.BIBFRAME.ComposerContribution;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ComposerContributionContributedTo extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ComposerContributionContributedTo currentInstance = null;
	private static final Log log = LogFactory.getLog(ComposerContributionContributedTo.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ComposerContributionContributedToIterator theComposerContributionContributedToIterator = (ComposerContributionContributedToIterator)findAncestorWithClass(this, ComposerContributionContributedToIterator.class);
			pageContext.getOut().print(theComposerContributionContributedToIterator.getContributedTo());
		} catch (Exception e) {
			log.error("Can't find enclosing ComposerContribution for contributedTo tag ", e);
			throw new JspTagException("Error: Can't find enclosing ComposerContribution for contributedTo tag ");
		}
		return SKIP_BODY;
	}
}

