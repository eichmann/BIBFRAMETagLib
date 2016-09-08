package edu.uiowa.slis.BIBFRAME.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationLocationOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static LocationLocationOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationLocationOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LocationLocationOfIterator theLocationLocationOfIterator = (LocationLocationOfIterator)findAncestorWithClass(this, LocationLocationOfIterator.class);
			pageContext.getOut().print(theLocationLocationOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for locationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for locationOf tag ");
		}
		return SKIP_BODY;
	}
}

