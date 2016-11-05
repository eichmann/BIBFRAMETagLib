package edu.uiowa.slis.BIBFRAME.GovernmentOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentOrganizationRelationInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static GovernmentOrganizationRelationInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentOrganizationRelationInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentOrganizationRelationInverseIterator theGovernmentOrganizationRelationInverseIterator = (GovernmentOrganizationRelationInverseIterator)findAncestorWithClass(this, GovernmentOrganizationRelationInverseIterator.class);
			pageContext.getOut().print(theGovernmentOrganizationRelationInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentOrganization for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentOrganization for relation tag ");
		}
		return SKIP_BODY;
	}
}

