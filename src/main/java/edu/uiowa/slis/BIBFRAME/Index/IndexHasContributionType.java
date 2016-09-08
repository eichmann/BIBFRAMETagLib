package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexHasContributionType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexHasContributionType currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexHasContributionType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexHasContributionIterator theIndexHasContributionIterator = (IndexHasContributionIterator)findAncestorWithClass(this, IndexHasContributionIterator.class);
			pageContext.getOut().print(theIndexHasContributionIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for hasContribution tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for hasContribution tag ");
		}
		return SKIP_BODY;
	}
}

