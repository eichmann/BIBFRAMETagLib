package edu.uiowa.slis.BIBFRAME.Family;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FamilyIsPartOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FamilyIsPartOf currentInstance = null;
	private static final Log log = LogFactory.getLog(FamilyIsPartOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FamilyIsPartOfIterator theFamilyIsPartOfIterator = (FamilyIsPartOfIterator)findAncestorWithClass(this, FamilyIsPartOfIterator.class);
			pageContext.getOut().print(theFamilyIsPartOfIterator.getIsPartOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Family for isPartOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Family for isPartOf tag ");
		}
		return SKIP_BODY;
	}
}

