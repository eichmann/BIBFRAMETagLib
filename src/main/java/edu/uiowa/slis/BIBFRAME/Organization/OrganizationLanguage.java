package edu.uiowa.slis.BIBFRAME.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationLanguage extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static OrganizationLanguage currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationLanguage.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationLanguageIterator theOrganizationLanguageIterator = (OrganizationLanguageIterator)findAncestorWithClass(this, OrganizationLanguageIterator.class);
			pageContext.getOut().print(theOrganizationLanguageIterator.getLanguage());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for language tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for language tag ");
		}
		return SKIP_BODY;
	}
}

