package edu.uiowa.slis.BIBFRAME.RWO;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RWOAgentInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static RWOAgentInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(RWOAgentInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RWOAgentInverseIterator theRWOAgentInverseIterator = (RWOAgentInverseIterator)findAncestorWithClass(this, RWOAgentInverseIterator.class);
			pageContext.getOut().print(theRWOAgentInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing RWO for agent tag ", e);
			throw new JspTagException("Error: Can't find enclosing RWO for agent tag ");
		}
		return SKIP_BODY;
	}
}

