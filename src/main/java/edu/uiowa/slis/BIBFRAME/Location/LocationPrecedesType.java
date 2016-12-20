package edu.uiowa.slis.BIBFRAME.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationPrecedesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static LocationPrecedesType currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationPrecedesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LocationPrecedesIterator theLocationPrecedesIterator = (LocationPrecedesIterator)findAncestorWithClass(this, LocationPrecedesIterator.class);
			pageContext.getOut().print(theLocationPrecedesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for precedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for precedes tag ");
		}
		return SKIP_BODY;
	}
}

