package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetHasContribution extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetHasContribution currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetHasContribution.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetHasContributionIterator theDatasetHasContributionIterator = (DatasetHasContributionIterator)findAncestorWithClass(this, DatasetHasContributionIterator.class);
			pageContext.getOut().print(theDatasetHasContributionIterator.getHasContribution());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for hasContribution tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for hasContribution tag ");
		}
		return SKIP_BODY;
	}
}

