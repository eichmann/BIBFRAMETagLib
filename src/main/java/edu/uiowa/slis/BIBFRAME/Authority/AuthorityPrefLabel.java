package edu.uiowa.slis.BIBFRAME.Authority;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorityPrefLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AuthorityPrefLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorityPrefLabel.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorityPrefLabelIterator theAuthority = (AuthorityPrefLabelIterator)findAncestorWithClass(this, AuthorityPrefLabelIterator.class);
			pageContext.getOut().print(theAuthority.getPrefLabel());
		} catch (Exception e) {
			log.error("Can't find enclosing Authority for prefLabel tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authority for prefLabel tag ");
		}
		return SKIP_BODY;
	}
}

