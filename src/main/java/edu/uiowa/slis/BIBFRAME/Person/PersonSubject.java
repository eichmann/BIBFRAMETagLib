package edu.uiowa.slis.BIBFRAME.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonSubject extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PersonSubject currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonSubject.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonSubjectIterator thePersonSubjectIterator = (PersonSubjectIterator)findAncestorWithClass(this, PersonSubjectIterator.class);
			pageContext.getOut().print(thePersonSubjectIterator.getSubject());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for subject tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for subject tag ");
		}
		return SKIP_BODY;
	}
}

