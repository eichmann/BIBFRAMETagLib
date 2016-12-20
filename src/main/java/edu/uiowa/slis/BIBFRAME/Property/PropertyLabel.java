package edu.uiowa.slis.BIBFRAME.Property;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PropertyLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PropertyLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(PropertyLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Property theProperty = (Property)findAncestorWithClass(this, Property.class);
			if (!theProperty.commitNeeded) {
				pageContext.getOut().print(theProperty.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Property for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Property for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Property theProperty = (Property)findAncestorWithClass(this, Property.class);
			return theProperty.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Property for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Property for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Property theProperty = (Property)findAncestorWithClass(this, Property.class);
			theProperty.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Property for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Property for label tag ");
		}
	}
}

