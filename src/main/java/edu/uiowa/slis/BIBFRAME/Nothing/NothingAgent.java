package edu.uiowa.slis.BIBFRAME.Nothing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NothingAgent extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NothingAgent currentInstance = null;
	private static final Log log = LogFactory.getLog(NothingAgent.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NothingAgentIterator theNothingAgentIterator = (NothingAgentIterator)findAncestorWithClass(this, NothingAgentIterator.class);
			pageContext.getOut().print(theNothingAgentIterator.getAgent());
		} catch (Exception e) {
			log.error("Can't find enclosing Nothing for agent tag ", e);
			throw new JspTagException("Error: Can't find enclosing Nothing for agent tag ");
		}
		return SKIP_BODY;
	}
}

