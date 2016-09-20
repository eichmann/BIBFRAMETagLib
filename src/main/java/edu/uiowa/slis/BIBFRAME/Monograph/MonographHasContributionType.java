package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographHasContributionType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographHasContributionType currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographHasContributionType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographHasContributionIterator theMonographHasContributionIterator = (MonographHasContributionIterator)findAncestorWithClass(this, MonographHasContributionIterator.class);
			pageContext.getOut().print(theMonographHasContributionIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for hasContribution tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for hasContribution tag ");
		}
		return SKIP_BODY;
	}
}

