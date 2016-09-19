package edu.uiowa.slis.BIBFRAME.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationIsSubjectOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static LocationIsSubjectOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationIsSubjectOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LocationIsSubjectOfIterator theLocationIsSubjectOfIterator = (LocationIsSubjectOfIterator)findAncestorWithClass(this, LocationIsSubjectOfIterator.class);
			pageContext.getOut().print(theLocationIsSubjectOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for isSubjectOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for isSubjectOf tag ");
		}
		return SKIP_BODY;
	}
}

