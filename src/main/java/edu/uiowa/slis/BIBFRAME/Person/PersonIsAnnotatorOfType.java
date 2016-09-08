package edu.uiowa.slis.BIBFRAME.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonIsAnnotatorOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PersonIsAnnotatorOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonIsAnnotatorOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonIsAnnotatorOfIterator thePersonIsAnnotatorOfIterator = (PersonIsAnnotatorOfIterator)findAncestorWithClass(this, PersonIsAnnotatorOfIterator.class);
			pageContext.getOut().print(thePersonIsAnnotatorOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for isAnnotatorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for isAnnotatorOf tag ");
		}
		return SKIP_BODY;
	}
}

