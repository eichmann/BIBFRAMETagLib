package edu.uiowa.slis.BIBFRAME.PerformerContribution;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PerformerContributionContributedToType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PerformerContributionContributedToType currentInstance = null;
	private static final Log log = LogFactory.getLog(PerformerContributionContributedToType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PerformerContributionContributedToIterator thePerformerContributionContributedToIterator = (PerformerContributionContributedToIterator)findAncestorWithClass(this, PerformerContributionContributedToIterator.class);
			pageContext.getOut().print(thePerformerContributionContributedToIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PerformerContribution for contributedTo tag ", e);
			throw new JspTagException("Error: Can't find enclosing PerformerContribution for contributedTo tag ");
		}
		return SKIP_BODY;
	}
}

