package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceAgentInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceAgentInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceAgentInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FiniteResourceAgentInverseIterator theFiniteResourceAgentInverseIterator = (FiniteResourceAgentInverseIterator)findAncestorWithClass(this, FiniteResourceAgentInverseIterator.class);
			pageContext.getOut().print(theFiniteResourceAgentInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for agent tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for agent tag ");
		}
		return SKIP_BODY;
	}
}

