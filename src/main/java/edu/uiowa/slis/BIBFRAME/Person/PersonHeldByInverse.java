package edu.uiowa.slis.BIBFRAME.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonHeldByInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PersonHeldByInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonHeldByInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonHeldByInverseIterator thePersonHeldByInverseIterator = (PersonHeldByInverseIterator)findAncestorWithClass(this, PersonHeldByInverseIterator.class);
			pageContext.getOut().print(thePersonHeldByInverseIterator.getHeldByInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for heldBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for heldBy tag ");
		}
		return SKIP_BODY;
	}
}

