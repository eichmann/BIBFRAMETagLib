package edu.uiowa.slis.BIBFRAME.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonHasPart extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PersonHasPart currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonHasPart.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonHasPartIterator thePersonHasPartIterator = (PersonHasPartIterator)findAncestorWithClass(this, PersonHasPartIterator.class);
			pageContext.getOut().print(thePersonHasPartIterator.getHasPart());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for hasPart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for hasPart tag ");
		}
		return SKIP_BODY;
	}
}

