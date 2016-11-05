package edu.uiowa.slis.BIBFRAME.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationRelationInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static OrganizationRelationInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationRelationInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationRelationInverseIterator theOrganizationRelationInverseIterator = (OrganizationRelationInverseIterator)findAncestorWithClass(this, OrganizationRelationInverseIterator.class);
			pageContext.getOut().print(theOrganizationRelationInverseIterator.getRelationInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for relation tag ");
		}
		return SKIP_BODY;
	}
}

