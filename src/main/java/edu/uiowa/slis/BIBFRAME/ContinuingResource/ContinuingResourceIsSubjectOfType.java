package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourceIsSubjectOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourceIsSubjectOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourceIsSubjectOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourceIsSubjectOfIterator theContinuingResourceIsSubjectOfIterator = (ContinuingResourceIsSubjectOfIterator)findAncestorWithClass(this, ContinuingResourceIsSubjectOfIterator.class);
			pageContext.getOut().print(theContinuingResourceIsSubjectOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for isSubjectOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for isSubjectOf tag ");
		}
		return SKIP_BODY;
	}
}
