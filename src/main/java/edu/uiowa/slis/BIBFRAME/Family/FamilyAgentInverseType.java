package edu.uiowa.slis.BIBFRAME.Family;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FamilyAgentInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FamilyAgentInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(FamilyAgentInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FamilyAgentInverseIterator theFamilyAgentInverseIterator = (FamilyAgentInverseIterator)findAncestorWithClass(this, FamilyAgentInverseIterator.class);
			pageContext.getOut().print(theFamilyAgentInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Family for agent tag ", e);
			throw new JspTagException("Error: Can't find enclosing Family for agent tag ");
		}
		return SKIP_BODY;
	}
}

