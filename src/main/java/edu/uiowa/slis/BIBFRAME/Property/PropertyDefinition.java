package edu.uiowa.slis.BIBFRAME.Property;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PropertyDefinition extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PropertyDefinition currentInstance = null;
	private static final Log log = LogFactory.getLog(PropertyDefinition.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PropertyDefinitionIterator theProperty = (PropertyDefinitionIterator)findAncestorWithClass(this, PropertyDefinitionIterator.class);
			pageContext.getOut().print(theProperty.getDefinition());
		} catch (Exception e) {
			log.error("Can't find enclosing Property for definition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Property for definition tag ");
		}
		return SKIP_BODY;
	}
}

