package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographHasContribution extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographHasContribution currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographHasContribution.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographHasContributionIterator theMonographHasContributionIterator = (MonographHasContributionIterator)findAncestorWithClass(this, MonographHasContributionIterator.class);
			pageContext.getOut().print(theMonographHasContributionIterator.getHasContribution());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for hasContribution tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for hasContribution tag ");
		}
		return SKIP_BODY;
	}
}

