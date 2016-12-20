package edu.uiowa.slis.BIBFRAME.Instance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstanceIsSubjectOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static InstanceIsSubjectOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(InstanceIsSubjectOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstanceIsSubjectOfIterator theInstanceIsSubjectOfIterator = (InstanceIsSubjectOfIterator)findAncestorWithClass(this, InstanceIsSubjectOfIterator.class);
			pageContext.getOut().print(theInstanceIsSubjectOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Instance for isSubjectOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Instance for isSubjectOf tag ");
		}
		return SKIP_BODY;
	}
}

