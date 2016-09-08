package edu.uiowa.slis.BIBFRAME.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static LocationSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Location theLocation = (Location)findAncestorWithClass(this, Location.class);
			if (!theLocation.commitNeeded) {
				pageContext.getOut().print(theLocation.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Location for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Location theLocation = (Location)findAncestorWithClass(this, Location.class);
			return theLocation.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Location for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Location theLocation = (Location)findAncestorWithClass(this, Location.class);
			theLocation.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Location for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for subjectURI tag ");
		}
	}
}

