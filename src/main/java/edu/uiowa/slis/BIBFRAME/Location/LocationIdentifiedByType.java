package edu.uiowa.slis.BIBFRAME.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationIdentifiedByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static LocationIdentifiedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationIdentifiedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LocationIdentifiedByIterator theLocationIdentifiedByIterator = (LocationIdentifiedByIterator)findAncestorWithClass(this, LocationIdentifiedByIterator.class);
			pageContext.getOut().print(theLocationIdentifiedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for identifiedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for identifiedBy tag ");
		}
		return SKIP_BODY;
	}
}

