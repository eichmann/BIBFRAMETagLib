package edu.uiowa.slis.BIBFRAME.Family;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FamilyIdentifiedByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FamilyIdentifiedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(FamilyIdentifiedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FamilyIdentifiedByIterator theFamilyIdentifiedByIterator = (FamilyIdentifiedByIterator)findAncestorWithClass(this, FamilyIdentifiedByIterator.class);
			pageContext.getOut().print(theFamilyIdentifiedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Family for identifiedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Family for identifiedBy tag ");
		}
		return SKIP_BODY;
	}
}

