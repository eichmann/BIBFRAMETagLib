package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographHasContribution extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographHasContribution currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographHasContribution.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographHasContributionIterator theMultipartMonographHasContributionIterator = (MultipartMonographHasContributionIterator)findAncestorWithClass(this, MultipartMonographHasContributionIterator.class);
			pageContext.getOut().print(theMultipartMonographHasContributionIterator.getHasContribution());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for hasContribution tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for hasContribution tag ");
		}
		return SKIP_BODY;
	}
}

