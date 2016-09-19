package edu.uiowa.slis.BIBFRAME.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonReceivedType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PersonReceivedType currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonReceivedType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonReceivedIterator thePersonReceivedIterator = (PersonReceivedIterator)findAncestorWithClass(this, PersonReceivedIterator.class);
			pageContext.getOut().print(thePersonReceivedIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for received tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for received tag ");
		}
		return SKIP_BODY;
	}
}

