package edu.uiowa.slis.BIBFRAME.Authority;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorityIdentifiesRWOType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AuthorityIdentifiesRWOType currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorityIdentifiesRWOType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AuthorityIdentifiesRWOIterator theAuthorityIdentifiesRWOIterator = (AuthorityIdentifiesRWOIterator)findAncestorWithClass(this, AuthorityIdentifiesRWOIterator.class);
			pageContext.getOut().print(theAuthorityIdentifiesRWOIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Authority for identifiesRWO tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authority for identifiesRWO tag ");
		}
		return SKIP_BODY;
	}
}

