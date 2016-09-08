package edu.uiowa.slis.BIBFRAME.ConductorContribution;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConductorContributionContributedToType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ConductorContributionContributedToType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConductorContributionContributedToType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConductorContributionContributedToIterator theConductorContributionContributedToIterator = (ConductorContributionContributedToIterator)findAncestorWithClass(this, ConductorContributionContributedToIterator.class);
			pageContext.getOut().print(theConductorContributionContributedToIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ConductorContribution for contributedTo tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConductorContribution for contributedTo tag ");
		}
		return SKIP_BODY;
	}
}

