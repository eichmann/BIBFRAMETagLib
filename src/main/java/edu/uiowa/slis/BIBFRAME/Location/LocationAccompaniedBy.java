package edu.uiowa.slis.BIBFRAME.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationAccompaniedBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static LocationAccompaniedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationAccompaniedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LocationAccompaniedByIterator theLocationAccompaniedByIterator = (LocationAccompaniedByIterator)findAncestorWithClass(this, LocationAccompaniedByIterator.class);
			pageContext.getOut().print(theLocationAccompaniedByIterator.getAccompaniedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for accompaniedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for accompaniedBy tag ");
		}
		return SKIP_BODY;
	}
}

