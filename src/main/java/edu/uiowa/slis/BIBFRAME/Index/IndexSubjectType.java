package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexSubjectType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexSubjectType currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexSubjectType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexSubjectIterator theIndexSubjectIterator = (IndexSubjectIterator)findAncestorWithClass(this, IndexSubjectIterator.class);
			pageContext.getOut().print(theIndexSubjectIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for subject tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for subject tag ");
		}
		return SKIP_BODY;
	}
}

