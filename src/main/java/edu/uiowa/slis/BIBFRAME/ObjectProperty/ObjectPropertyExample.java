package edu.uiowa.slis.BIBFRAME.ObjectProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ObjectPropertyExample extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ObjectPropertyExample currentInstance = null;
	private static final Log log = LogFactory.getLog(ObjectPropertyExample.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ObjectPropertyExampleIterator theObjectProperty = (ObjectPropertyExampleIterator)findAncestorWithClass(this, ObjectPropertyExampleIterator.class);
			pageContext.getOut().print(theObjectProperty.getExample());
		} catch (Exception e) {
			log.error("Can't find enclosing ObjectProperty for example tag ", e);
			throw new JspTagException("Error: Can't find enclosing ObjectProperty for example tag ");
		}
		return SKIP_BODY;
	}
}

