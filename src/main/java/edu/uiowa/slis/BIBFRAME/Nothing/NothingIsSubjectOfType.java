package edu.uiowa.slis.BIBFRAME.Nothing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NothingIsSubjectOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NothingIsSubjectOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(NothingIsSubjectOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NothingIsSubjectOfIterator theNothingIsSubjectOfIterator = (NothingIsSubjectOfIterator)findAncestorWithClass(this, NothingIsSubjectOfIterator.class);
			pageContext.getOut().print(theNothingIsSubjectOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Nothing for isSubjectOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Nothing for isSubjectOf tag ");
		}
		return SKIP_BODY;
	}
}

