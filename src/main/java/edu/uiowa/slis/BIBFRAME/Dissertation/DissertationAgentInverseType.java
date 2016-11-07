package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationAgentInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationAgentInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationAgentInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DissertationAgentInverseIterator theDissertationAgentInverseIterator = (DissertationAgentInverseIterator)findAncestorWithClass(this, DissertationAgentInverseIterator.class);
			pageContext.getOut().print(theDissertationAgentInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for agent tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for agent tag ");
		}
		return SKIP_BODY;
	}
}
