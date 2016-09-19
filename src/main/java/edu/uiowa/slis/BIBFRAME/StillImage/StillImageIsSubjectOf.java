package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageIsSubjectOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageIsSubjectOf currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageIsSubjectOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImageIsSubjectOfIterator theStillImageIsSubjectOfIterator = (StillImageIsSubjectOfIterator)findAncestorWithClass(this, StillImageIsSubjectOfIterator.class);
			pageContext.getOut().print(theStillImageIsSubjectOfIterator.getIsSubjectOf());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for isSubjectOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for isSubjectOf tag ");
		}
		return SKIP_BODY;
	}
}

