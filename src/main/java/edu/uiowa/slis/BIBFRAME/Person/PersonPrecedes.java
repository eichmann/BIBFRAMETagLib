package edu.uiowa.slis.BIBFRAME.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonPrecedes extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PersonPrecedes currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonPrecedes.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonPrecedesIterator thePersonPrecedesIterator = (PersonPrecedesIterator)findAncestorWithClass(this, PersonPrecedesIterator.class);
			pageContext.getOut().print(thePersonPrecedesIterator.getPrecedes());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for precedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for precedes tag ");
		}
		return SKIP_BODY;
	}
}

