package edu.uiowa.slis.BIBFRAME.Authority;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorityName extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AuthorityName currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorityName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorityNameIterator theAuthority = (AuthorityNameIterator)findAncestorWithClass(this, AuthorityNameIterator.class);
			pageContext.getOut().print(theAuthority.getName());
		} catch (Exception e) {
			log.error("Can't find enclosing Authority for name tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authority for name tag ");
		}
		return SKIP_BODY;
	}
}

