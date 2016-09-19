package edu.uiowa.slis.BIBFRAME.Authority;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorityIsSubjectOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AuthorityIsSubjectOf currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorityIsSubjectOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AuthorityIsSubjectOfIterator theAuthorityIsSubjectOfIterator = (AuthorityIsSubjectOfIterator)findAncestorWithClass(this, AuthorityIsSubjectOfIterator.class);
			pageContext.getOut().print(theAuthorityIsSubjectOfIterator.getIsSubjectOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Authority for isSubjectOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authority for isSubjectOf tag ");
		}
		return SKIP_BODY;
	}
}

