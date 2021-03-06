package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageSubject extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageSubject currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageSubject.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImageSubjectIterator theStillImageSubjectIterator = (StillImageSubjectIterator)findAncestorWithClass(this, StillImageSubjectIterator.class);
			pageContext.getOut().print(theStillImageSubjectIterator.getSubject());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for subject tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for subject tag ");
		}
		return SKIP_BODY;
	}
}

