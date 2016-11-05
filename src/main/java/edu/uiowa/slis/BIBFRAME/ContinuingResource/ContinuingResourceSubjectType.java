package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourceSubjectType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourceSubjectType currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourceSubjectType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourceSubjectIterator theContinuingResourceSubjectIterator = (ContinuingResourceSubjectIterator)findAncestorWithClass(this, ContinuingResourceSubjectIterator.class);
			pageContext.getOut().print(theContinuingResourceSubjectIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for subject tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for subject tag ");
		}
		return SKIP_BODY;
	}
}

