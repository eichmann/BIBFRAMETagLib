package edu.uiowa.slis.BIBFRAME.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonLanguageType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PersonLanguageType currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonLanguageType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonLanguageIterator thePersonLanguageIterator = (PersonLanguageIterator)findAncestorWithClass(this, PersonLanguageIterator.class);
			pageContext.getOut().print(thePersonLanguageIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for language tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for language tag ");
		}
		return SKIP_BODY;
	}
}

