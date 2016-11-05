package edu.uiowa.slis.BIBFRAME.Family;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FamilyRelationInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FamilyRelationInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(FamilyRelationInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FamilyRelationInverseIterator theFamilyRelationInverseIterator = (FamilyRelationInverseIterator)findAncestorWithClass(this, FamilyRelationInverseIterator.class);
			pageContext.getOut().print(theFamilyRelationInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Family for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Family for relation tag ");
		}
		return SKIP_BODY;
	}
}

