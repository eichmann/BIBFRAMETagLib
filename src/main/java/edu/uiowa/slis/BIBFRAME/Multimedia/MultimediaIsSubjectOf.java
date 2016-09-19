package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaIsSubjectOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaIsSubjectOf currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaIsSubjectOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaIsSubjectOfIterator theMultimediaIsSubjectOfIterator = (MultimediaIsSubjectOfIterator)findAncestorWithClass(this, MultimediaIsSubjectOfIterator.class);
			pageContext.getOut().print(theMultimediaIsSubjectOfIterator.getIsSubjectOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for isSubjectOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for isSubjectOf tag ");
		}
		return SKIP_BODY;
	}
}

