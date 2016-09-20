package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperHasContributionType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperHasContributionType currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperHasContributionType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperHasContributionIterator theNewspaperHasContributionIterator = (NewspaperHasContributionIterator)findAncestorWithClass(this, NewspaperHasContributionIterator.class);
			pageContext.getOut().print(theNewspaperHasContributionIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for hasContribution tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for hasContribution tag ");
		}
		return SKIP_BODY;
	}
}

