package edu.uiowa.slis.BIBFRAME.Family;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FamilyBirthDate extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FamilyBirthDate currentInstance = null;
	private static final Log log = LogFactory.getLog(FamilyBirthDate.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FamilyBirthDateIterator theFamily = (FamilyBirthDateIterator)findAncestorWithClass(this, FamilyBirthDateIterator.class);
			pageContext.getOut().print(theFamily.getBirthDate());
		} catch (Exception e) {
			log.error("Can't find enclosing Family for birthDate tag ", e);
			throw new JspTagException("Error: Can't find enclosing Family for birthDate tag ");
		}
		return SKIP_BODY;
	}
}

