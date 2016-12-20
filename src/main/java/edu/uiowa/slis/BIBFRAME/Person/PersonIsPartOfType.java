package edu.uiowa.slis.BIBFRAME.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonIsPartOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PersonIsPartOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonIsPartOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonIsPartOfIterator thePersonIsPartOfIterator = (PersonIsPartOfIterator)findAncestorWithClass(this, PersonIsPartOfIterator.class);
			pageContext.getOut().print(thePersonIsPartOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for isPartOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for isPartOf tag ");
		}
		return SKIP_BODY;
	}
}

