package edu.uiowa.slis.BIBFRAME.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonHasAnnotation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PersonHasAnnotation currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonHasAnnotation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonHasAnnotationIterator thePersonHasAnnotationIterator = (PersonHasAnnotationIterator)findAncestorWithClass(this, PersonHasAnnotationIterator.class);
			pageContext.getOut().print(thePersonHasAnnotationIterator.getHasAnnotation());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for hasAnnotation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for hasAnnotation tag ");
		}
		return SKIP_BODY;
	}
}

