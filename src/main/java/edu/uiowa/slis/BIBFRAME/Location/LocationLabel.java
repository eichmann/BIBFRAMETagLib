package edu.uiowa.slis.BIBFRAME.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static LocationLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Location theLocation = (Location)findAncestorWithClass(this, Location.class);
			if (!theLocation.commitNeeded) {
				pageContext.getOut().print(theLocation.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Location for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Location theLocation = (Location)findAncestorWithClass(this, Location.class);
			return theLocation.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Location for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Location theLocation = (Location)findAncestorWithClass(this, Location.class);
			theLocation.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Location for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for label tag ");
		}
	}
}

