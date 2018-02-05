package edu.uiowa.slis.BIBFRAME.Property;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PropertySeeAlso extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PropertySeeAlso currentInstance = null;
	private static final Log log = LogFactory.getLog(PropertySeeAlso.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PropertySeeAlsoIterator theProperty = (PropertySeeAlsoIterator)findAncestorWithClass(this, PropertySeeAlsoIterator.class);
			pageContext.getOut().print(theProperty.getSeeAlso());
		} catch (Exception e) {
			log.error("Can't find enclosing Property for seeAlso tag ", e);
			throw new JspTagException("Error: Can't find enclosing Property for seeAlso tag ");
		}
		return SKIP_BODY;
	}
}

