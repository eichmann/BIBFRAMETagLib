package edu.uiowa.slis.BIBFRAME.Family;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FamilyName extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FamilyName currentInstance = null;
	private static final Log log = LogFactory.getLog(FamilyName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FamilyNameIterator theFamily = (FamilyNameIterator)findAncestorWithClass(this, FamilyNameIterator.class);
			pageContext.getOut().print(theFamily.getName());
		} catch (Exception e) {
			log.error("Can't find enclosing Family for name tag ", e);
			throw new JspTagException("Error: Can't find enclosing Family for name tag ");
		}
		return SKIP_BODY;
	}
}

