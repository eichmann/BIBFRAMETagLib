package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaSubject extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaSubject currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaSubject.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaSubjectIterator theMultimediaSubjectIterator = (MultimediaSubjectIterator)findAncestorWithClass(this, MultimediaSubjectIterator.class);
			pageContext.getOut().print(theMultimediaSubjectIterator.getSubject());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for subject tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for subject tag ");
		}
		return SKIP_BODY;
	}
}

