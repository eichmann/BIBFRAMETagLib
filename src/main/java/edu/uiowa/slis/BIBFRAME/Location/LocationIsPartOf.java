package edu.uiowa.slis.BIBFRAME.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationIsPartOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static LocationIsPartOf currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationIsPartOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LocationIsPartOfIterator theLocationIsPartOfIterator = (LocationIsPartOfIterator)findAncestorWithClass(this, LocationIsPartOfIterator.class);
			pageContext.getOut().print(theLocationIsPartOfIterator.getIsPartOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for isPartOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for isPartOf tag ");
		}
		return SKIP_BODY;
	}
}

