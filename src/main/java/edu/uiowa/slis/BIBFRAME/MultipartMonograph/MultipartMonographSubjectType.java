package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographSubjectType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographSubjectType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographSubjectType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographSubjectIterator theMultipartMonographSubjectIterator = (MultipartMonographSubjectIterator)findAncestorWithClass(this, MultipartMonographSubjectIterator.class);
			pageContext.getOut().print(theMultipartMonographSubjectIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for subject tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for subject tag ");
		}
		return SKIP_BODY;
	}
}

