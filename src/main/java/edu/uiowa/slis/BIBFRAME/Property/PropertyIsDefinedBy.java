package edu.uiowa.slis.BIBFRAME.Property;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PropertyIsDefinedBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PropertyIsDefinedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(PropertyIsDefinedBy.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PropertyIsDefinedByIterator theProperty = (PropertyIsDefinedByIterator)findAncestorWithClass(this, PropertyIsDefinedByIterator.class);
			pageContext.getOut().print(theProperty.getIsDefinedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Property for isDefinedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Property for isDefinedBy tag ");
		}
		return SKIP_BODY;
	}
}

