package edu.uiowa.slis.BIBFRAME.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationHasOriginPlaceInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static LocationHasOriginPlaceInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationHasOriginPlaceInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LocationHasOriginPlaceInverseIterator theLocationHasOriginPlaceInverseIterator = (LocationHasOriginPlaceInverseIterator)findAncestorWithClass(this, LocationHasOriginPlaceInverseIterator.class);
			pageContext.getOut().print(theLocationHasOriginPlaceInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for hasOriginPlace tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for hasOriginPlace tag ");
		}
		return SKIP_BODY;
	}
}

