package edu.uiowa.slis.BIBFRAME.Family;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FamilyIsSubjectOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FamilyIsSubjectOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(FamilyIsSubjectOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FamilyIsSubjectOfIterator theFamilyIsSubjectOfIterator = (FamilyIsSubjectOfIterator)findAncestorWithClass(this, FamilyIsSubjectOfIterator.class);
			pageContext.getOut().print(theFamilyIsSubjectOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Family for isSubjectOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Family for isSubjectOf tag ");
		}
		return SKIP_BODY;
	}
}

