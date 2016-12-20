package edu.uiowa.slis.BIBFRAME.Property;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PropertyTerm_status extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PropertyTerm_status currentInstance = null;
	private static final Log log = LogFactory.getLog(PropertyTerm_status.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PropertyTerm_statusIterator theProperty = (PropertyTerm_statusIterator)findAncestorWithClass(this, PropertyTerm_statusIterator.class);
			pageContext.getOut().print(theProperty.getTerm_status());
		} catch (Exception e) {
			log.error("Can't find enclosing Property for term_status tag ", e);
			throw new JspTagException("Error: Can't find enclosing Property for term_status tag ");
		}
		return SKIP_BODY;
	}
}

