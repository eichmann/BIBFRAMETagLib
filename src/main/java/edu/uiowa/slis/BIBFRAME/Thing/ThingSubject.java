package edu.uiowa.slis.BIBFRAME.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingSubject extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThingSubject currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingSubject.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThingSubjectIterator theThingSubjectIterator = (ThingSubjectIterator)findAncestorWithClass(this, ThingSubjectIterator.class);
			pageContext.getOut().print(theThingSubjectIterator.getSubject());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for subject tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for subject tag ");
		}
		return SKIP_BODY;
	}
}

