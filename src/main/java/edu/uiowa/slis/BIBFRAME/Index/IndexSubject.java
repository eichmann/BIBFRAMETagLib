package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexSubject extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexSubject currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexSubject.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexSubjectIterator theIndexSubjectIterator = (IndexSubjectIterator)findAncestorWithClass(this, IndexSubjectIterator.class);
			pageContext.getOut().print(theIndexSubjectIterator.getSubject());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for subject tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for subject tag ");
		}
		return SKIP_BODY;
	}
}

