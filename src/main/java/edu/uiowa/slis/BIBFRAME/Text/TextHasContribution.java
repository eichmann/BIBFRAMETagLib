package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextHasContribution extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextHasContribution currentInstance = null;
	private static final Log log = LogFactory.getLog(TextHasContribution.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextHasContributionIterator theTextHasContributionIterator = (TextHasContributionIterator)findAncestorWithClass(this, TextHasContributionIterator.class);
			pageContext.getOut().print(theTextHasContributionIterator.getHasContribution());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for hasContribution tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for hasContribution tag ");
		}
		return SKIP_BODY;
	}
}

