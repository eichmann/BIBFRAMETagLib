package edu.uiowa.slis.BIBFRAME.RWO;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RWOIsSubjectOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static RWOIsSubjectOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(RWOIsSubjectOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RWOIsSubjectOfIterator theRWOIsSubjectOfIterator = (RWOIsSubjectOfIterator)findAncestorWithClass(this, RWOIsSubjectOfIterator.class);
			pageContext.getOut().print(theRWOIsSubjectOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing RWO for isSubjectOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing RWO for isSubjectOf tag ");
		}
		return SKIP_BODY;
	}
}

