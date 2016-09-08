package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesHasContribution extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesHasContribution currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesHasContribution.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesHasContributionIterator theSeriesHasContributionIterator = (SeriesHasContributionIterator)findAncestorWithClass(this, SeriesHasContributionIterator.class);
			pageContext.getOut().print(theSeriesHasContributionIterator.getHasContribution());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for hasContribution tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for hasContribution tag ");
		}
		return SKIP_BODY;
	}
}

