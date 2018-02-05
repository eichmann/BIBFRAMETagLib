package edu.uiowa.slis.BIBFRAME.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationName extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static LocationName currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationNameIterator theLocation = (LocationNameIterator)findAncestorWithClass(this, LocationNameIterator.class);
			pageContext.getOut().print(theLocation.getName());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for name tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for name tag ");
		}
		return SKIP_BODY;
	}
}

