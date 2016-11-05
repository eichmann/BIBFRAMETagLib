package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageAgentInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageAgentInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageAgentInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImageAgentInverseIterator theStillImageAgentInverseIterator = (StillImageAgentInverseIterator)findAncestorWithClass(this, StillImageAgentInverseIterator.class);
			pageContext.getOut().print(theStillImageAgentInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for agent tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for agent tag ");
		}
		return SKIP_BODY;
	}
}

