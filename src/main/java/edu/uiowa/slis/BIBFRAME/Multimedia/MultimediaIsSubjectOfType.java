package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaIsSubjectOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaIsSubjectOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaIsSubjectOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaIsSubjectOfIterator theMultimediaIsSubjectOfIterator = (MultimediaIsSubjectOfIterator)findAncestorWithClass(this, MultimediaIsSubjectOfIterator.class);
			pageContext.getOut().print(theMultimediaIsSubjectOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for isSubjectOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for isSubjectOf tag ");
		}
		return SKIP_BODY;
	}
}

