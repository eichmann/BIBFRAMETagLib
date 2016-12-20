package edu.uiowa.slis.BIBFRAME.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationBirthDate extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static LocationBirthDate currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationBirthDate.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationBirthDateIterator theLocation = (LocationBirthDateIterator)findAncestorWithClass(this, LocationBirthDateIterator.class);
			pageContext.getOut().print(theLocation.getBirthDate());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for birthDate tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for birthDate tag ");
		}
		return SKIP_BODY;
	}
}

