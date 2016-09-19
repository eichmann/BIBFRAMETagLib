package edu.uiowa.slis.BIBFRAME.Family;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FamilyHeldByInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FamilyHeldByInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(FamilyHeldByInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FamilyHeldByInverseIterator theFamilyHeldByInverseIterator = (FamilyHeldByInverseIterator)findAncestorWithClass(this, FamilyHeldByInverseIterator.class);
			pageContext.getOut().print(theFamilyHeldByInverseIterator.getHeldByInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Family for heldBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Family for heldBy tag ");
		}
		return SKIP_BODY;
	}
}

