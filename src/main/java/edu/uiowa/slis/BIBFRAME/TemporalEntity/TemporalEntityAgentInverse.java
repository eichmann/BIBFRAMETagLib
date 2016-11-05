package edu.uiowa.slis.BIBFRAME.TemporalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TemporalEntityAgentInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TemporalEntityAgentInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(TemporalEntityAgentInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TemporalEntityAgentInverseIterator theTemporalEntityAgentInverseIterator = (TemporalEntityAgentInverseIterator)findAncestorWithClass(this, TemporalEntityAgentInverseIterator.class);
			pageContext.getOut().print(theTemporalEntityAgentInverseIterator.getAgentInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing TemporalEntity for agent tag ", e);
			throw new JspTagException("Error: Can't find enclosing TemporalEntity for agent tag ");
		}
		return SKIP_BODY;
	}
}

