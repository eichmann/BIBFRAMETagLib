package edu.uiowa.slis.BIBFRAME.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationHasOriginPlaceInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static LocationHasOriginPlaceInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationHasOriginPlaceInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LocationHasOriginPlaceInverseIterator theLocationHasOriginPlaceInverseIterator = (LocationHasOriginPlaceInverseIterator)findAncestorWithClass(this, LocationHasOriginPlaceInverseIterator.class);
			pageContext.getOut().print(theLocationHasOriginPlaceInverseIterator.getHasOriginPlaceInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for hasOriginPlace tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for hasOriginPlace tag ");
		}
		return SKIP_BODY;
	}
}

