package edu.uiowa.slis.BIBFRAME.Family;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FamilyDeathDate extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FamilyDeathDate currentInstance = null;
	private static final Log log = LogFactory.getLog(FamilyDeathDate.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FamilyDeathDateIterator theFamily = (FamilyDeathDateIterator)findAncestorWithClass(this, FamilyDeathDateIterator.class);
			pageContext.getOut().print(theFamily.getDeathDate());
		} catch (Exception e) {
			log.error("Can't find enclosing Family for deathDate tag ", e);
			throw new JspTagException("Error: Can't find enclosing Family for deathDate tag ");
		}
		return SKIP_BODY;
	}
}

