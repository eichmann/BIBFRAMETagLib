package edu.uiowa.slis.BIBFRAME.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonIsSubjectOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PersonIsSubjectOf currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonIsSubjectOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonIsSubjectOfIterator thePersonIsSubjectOfIterator = (PersonIsSubjectOfIterator)findAncestorWithClass(this, PersonIsSubjectOfIterator.class);
			pageContext.getOut().print(thePersonIsSubjectOfIterator.getIsSubjectOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for isSubjectOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for isSubjectOf tag ");
		}
		return SKIP_BODY;
	}
}

