package edu.uiowa.slis.BIBFRAME.Nothing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NothingAgentType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NothingAgentType currentInstance = null;
	private static final Log log = LogFactory.getLog(NothingAgentType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NothingAgentIterator theNothingAgentIterator = (NothingAgentIterator)findAncestorWithClass(this, NothingAgentIterator.class);
			pageContext.getOut().print(theNothingAgentIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Nothing for agent tag ", e);
			throw new JspTagException("Error: Can't find enclosing Nothing for agent tag ");
		}
		return SKIP_BODY;
	}
}

