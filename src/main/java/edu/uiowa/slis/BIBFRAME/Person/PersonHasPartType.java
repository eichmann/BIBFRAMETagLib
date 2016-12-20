package edu.uiowa.slis.BIBFRAME.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonHasPartType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PersonHasPartType currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonHasPartType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonHasPartIterator thePersonHasPartIterator = (PersonHasPartIterator)findAncestorWithClass(this, PersonHasPartIterator.class);
			pageContext.getOut().print(thePersonHasPartIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for hasPart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for hasPart tag ");
		}
		return SKIP_BODY;
	}
}

