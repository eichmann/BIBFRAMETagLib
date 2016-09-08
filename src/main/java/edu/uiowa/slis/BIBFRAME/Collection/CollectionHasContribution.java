package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionHasContribution extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionHasContribution currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionHasContribution.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionHasContributionIterator theCollectionHasContributionIterator = (CollectionHasContributionIterator)findAncestorWithClass(this, CollectionHasContributionIterator.class);
			pageContext.getOut().print(theCollectionHasContributionIterator.getHasContribution());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for hasContribution tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for hasContribution tag ");
		}
		return SKIP_BODY;
	}
}

