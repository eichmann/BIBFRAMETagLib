package edu.uiowa.slis.BIBFRAME.Family;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FamilyIsAnnotatorOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FamilyIsAnnotatorOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(FamilyIsAnnotatorOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FamilyIsAnnotatorOfIterator theFamilyIsAnnotatorOfIterator = (FamilyIsAnnotatorOfIterator)findAncestorWithClass(this, FamilyIsAnnotatorOfIterator.class);
			pageContext.getOut().print(theFamilyIsAnnotatorOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Family for isAnnotatorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Family for isAnnotatorOf tag ");
		}
		return SKIP_BODY;
	}
}

