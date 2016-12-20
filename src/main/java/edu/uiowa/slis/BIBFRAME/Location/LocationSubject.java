package edu.uiowa.slis.BIBFRAME.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationSubject extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static LocationSubject currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationSubject.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LocationSubjectIterator theLocationSubjectIterator = (LocationSubjectIterator)findAncestorWithClass(this, LocationSubjectIterator.class);
			pageContext.getOut().print(theLocationSubjectIterator.getSubject());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for subject tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for subject tag ");
		}
		return SKIP_BODY;
	}
}

