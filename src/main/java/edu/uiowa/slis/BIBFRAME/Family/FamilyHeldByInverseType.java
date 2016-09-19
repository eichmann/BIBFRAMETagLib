package edu.uiowa.slis.BIBFRAME.Family;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FamilyHeldByInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FamilyHeldByInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(FamilyHeldByInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FamilyHeldByInverseIterator theFamilyHeldByInverseIterator = (FamilyHeldByInverseIterator)findAncestorWithClass(this, FamilyHeldByInverseIterator.class);
			pageContext.getOut().print(theFamilyHeldByInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Family for heldBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Family for heldBy tag ");
		}
		return SKIP_BODY;
	}
}

