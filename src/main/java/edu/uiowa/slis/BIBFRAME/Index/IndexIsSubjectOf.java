package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexIsSubjectOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexIsSubjectOf currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexIsSubjectOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexIsSubjectOfIterator theIndexIsSubjectOfIterator = (IndexIsSubjectOfIterator)findAncestorWithClass(this, IndexIsSubjectOfIterator.class);
			pageContext.getOut().print(theIndexIsSubjectOfIterator.getIsSubjectOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for isSubjectOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for isSubjectOf tag ");
		}
		return SKIP_BODY;
	}
}

