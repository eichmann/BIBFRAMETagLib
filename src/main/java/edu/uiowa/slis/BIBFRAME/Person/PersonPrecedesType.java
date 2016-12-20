package edu.uiowa.slis.BIBFRAME.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonPrecedesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PersonPrecedesType currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonPrecedesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonPrecedesIterator thePersonPrecedesIterator = (PersonPrecedesIterator)findAncestorWithClass(this, PersonPrecedesIterator.class);
			pageContext.getOut().print(thePersonPrecedesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for precedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for precedes tag ");
		}
		return SKIP_BODY;
	}
}

