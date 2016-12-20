package edu.uiowa.slis.BIBFRAME.Property;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PropertyExample extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PropertyExample currentInstance = null;
	private static final Log log = LogFactory.getLog(PropertyExample.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PropertyExampleIterator theProperty = (PropertyExampleIterator)findAncestorWithClass(this, PropertyExampleIterator.class);
			pageContext.getOut().print(theProperty.getExample());
		} catch (Exception e) {
			log.error("Can't find enclosing Property for example tag ", e);
			throw new JspTagException("Error: Can't find enclosing Property for example tag ");
		}
		return SKIP_BODY;
	}
}

