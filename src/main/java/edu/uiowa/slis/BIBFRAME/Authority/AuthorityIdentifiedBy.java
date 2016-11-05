package edu.uiowa.slis.BIBFRAME.Authority;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorityIdentifiedBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AuthorityIdentifiedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorityIdentifiedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AuthorityIdentifiedByIterator theAuthorityIdentifiedByIterator = (AuthorityIdentifiedByIterator)findAncestorWithClass(this, AuthorityIdentifiedByIterator.class);
			pageContext.getOut().print(theAuthorityIdentifiedByIterator.getIdentifiedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Authority for identifiedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authority for identifiedBy tag ");
		}
		return SKIP_BODY;
	}
}

