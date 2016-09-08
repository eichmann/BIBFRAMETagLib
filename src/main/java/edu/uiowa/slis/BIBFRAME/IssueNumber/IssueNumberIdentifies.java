package edu.uiowa.slis.BIBFRAME.IssueNumber;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssueNumberIdentifies extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IssueNumberIdentifies currentInstance = null;
	private static final Log log = LogFactory.getLog(IssueNumberIdentifies.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IssueNumberIdentifiesIterator theIssueNumberIdentifiesIterator = (IssueNumberIdentifiesIterator)findAncestorWithClass(this, IssueNumberIdentifiesIterator.class);
			pageContext.getOut().print(theIssueNumberIdentifiesIterator.getIdentifies());
		} catch (Exception e) {
			log.error("Can't find enclosing IssueNumber for identifies tag ", e);
			throw new JspTagException("Error: Can't find enclosing IssueNumber for identifies tag ");
		}
		return SKIP_BODY;
	}
}

