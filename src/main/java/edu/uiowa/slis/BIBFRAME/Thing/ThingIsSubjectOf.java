package edu.uiowa.slis.BIBFRAME.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingIsSubjectOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThingIsSubjectOf currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingIsSubjectOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThingIsSubjectOfIterator theThingIsSubjectOfIterator = (ThingIsSubjectOfIterator)findAncestorWithClass(this, ThingIsSubjectOfIterator.class);
			pageContext.getOut().print(theThingIsSubjectOfIterator.getIsSubjectOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for isSubjectOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for isSubjectOf tag ");
		}
		return SKIP_BODY;
	}
}

