package edu.uiowa.slis.BIBFRAME.Family;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FamilyIsPartOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FamilyIsPartOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(FamilyIsPartOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FamilyIsPartOfIterator theFamilyIsPartOfIterator = (FamilyIsPartOfIterator)findAncestorWithClass(this, FamilyIsPartOfIterator.class);
			pageContext.getOut().print(theFamilyIsPartOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Family for isPartOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Family for isPartOf tag ");
		}
		return SKIP_BODY;
	}
}

