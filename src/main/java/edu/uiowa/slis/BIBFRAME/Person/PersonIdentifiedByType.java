package edu.uiowa.slis.BIBFRAME.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonIdentifiedByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PersonIdentifiedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonIdentifiedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonIdentifiedByIterator thePersonIdentifiedByIterator = (PersonIdentifiedByIterator)findAncestorWithClass(this, PersonIdentifiedByIterator.class);
			pageContext.getOut().print(thePersonIdentifiedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for identifiedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for identifiedBy tag ");
		}
		return SKIP_BODY;
	}
}

