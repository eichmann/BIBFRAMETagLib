package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalHasAnnotationType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalHasAnnotationType currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalHasAnnotationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalHasAnnotationIterator theJournalHasAnnotationIterator = (JournalHasAnnotationIterator)findAncestorWithClass(this, JournalHasAnnotationIterator.class);
			pageContext.getOut().print(theJournalHasAnnotationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for hasAnnotation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for hasAnnotation tag ");
		}
		return SKIP_BODY;
	}
}

