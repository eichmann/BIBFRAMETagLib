package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographIsSubjectOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographIsSubjectOf currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographIsSubjectOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographIsSubjectOfIterator theMultipartMonographIsSubjectOfIterator = (MultipartMonographIsSubjectOfIterator)findAncestorWithClass(this, MultipartMonographIsSubjectOfIterator.class);
			pageContext.getOut().print(theMultipartMonographIsSubjectOfIterator.getIsSubjectOf());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for isSubjectOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for isSubjectOf tag ");
		}
		return SKIP_BODY;
	}
}

