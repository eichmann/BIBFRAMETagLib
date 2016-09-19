package edu.uiowa.slis.BIBFRAME.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationAgentInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static LocationAgentInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationAgentInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LocationAgentInverseIterator theLocationAgentInverseIterator = (LocationAgentInverseIterator)findAncestorWithClass(this, LocationAgentInverseIterator.class);
			pageContext.getOut().print(theLocationAgentInverseIterator.getAgentInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for agent tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for agent tag ");
		}
		return SKIP_BODY;
	}
}

