package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourceIsSubjectOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourceIsSubjectOf currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourceIsSubjectOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourceIsSubjectOfIterator theIntegratingResourceIsSubjectOfIterator = (IntegratingResourceIsSubjectOfIterator)findAncestorWithClass(this, IntegratingResourceIsSubjectOfIterator.class);
			pageContext.getOut().print(theIntegratingResourceIsSubjectOfIterator.getIsSubjectOf());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for isSubjectOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for isSubjectOf tag ");
		}
		return SKIP_BODY;
	}
}

