package edu.uiowa.slis.BIBFRAME.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationHasPartType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static LocationHasPartType currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationHasPartType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LocationHasPartIterator theLocationHasPartIterator = (LocationHasPartIterator)findAncestorWithClass(this, LocationHasPartIterator.class);
			pageContext.getOut().print(theLocationHasPartIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for hasPart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for hasPart tag ");
		}
		return SKIP_BODY;
	}
}

