package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationIsSubjectOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationIsSubjectOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationIsSubjectOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DissertationIsSubjectOfIterator theDissertationIsSubjectOfIterator = (DissertationIsSubjectOfIterator)findAncestorWithClass(this, DissertationIsSubjectOfIterator.class);
			pageContext.getOut().print(theDissertationIsSubjectOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for isSubjectOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for isSubjectOf tag ");
		}
		return SKIP_BODY;
	}
}

