package edu.uiowa.slis.BIBFRAME.ObjectProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ObjectPropertyLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ObjectPropertyLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ObjectPropertyLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ObjectProperty theObjectProperty = (ObjectProperty)findAncestorWithClass(this, ObjectProperty.class);
			if (!theObjectProperty.commitNeeded) {
				pageContext.getOut().print(theObjectProperty.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ObjectProperty for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ObjectProperty for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			ObjectProperty theObjectProperty = (ObjectProperty)findAncestorWithClass(this, ObjectProperty.class);
			return theObjectProperty.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing ObjectProperty for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ObjectProperty for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			ObjectProperty theObjectProperty = (ObjectProperty)findAncestorWithClass(this, ObjectProperty.class);
			theObjectProperty.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing ObjectProperty for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ObjectProperty for label tag ");
		}
	}
}

