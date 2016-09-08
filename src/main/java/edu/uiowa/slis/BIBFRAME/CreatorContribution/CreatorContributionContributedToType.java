package edu.uiowa.slis.BIBFRAME.CreatorContribution;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CreatorContributionContributedToType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CreatorContributionContributedToType currentInstance = null;
	private static final Log log = LogFactory.getLog(CreatorContributionContributedToType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CreatorContributionContributedToIterator theCreatorContributionContributedToIterator = (CreatorContributionContributedToIterator)findAncestorWithClass(this, CreatorContributionContributedToIterator.class);
			pageContext.getOut().print(theCreatorContributionContributedToIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CreatorContribution for contributedTo tag ", e);
			throw new JspTagException("Error: Can't find enclosing CreatorContribution for contributedTo tag ");
		}
		return SKIP_BODY;
	}
}

