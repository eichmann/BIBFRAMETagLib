package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperIsSubjectOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperIsSubjectOf currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperIsSubjectOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperIsSubjectOfIterator theNewspaperIsSubjectOfIterator = (NewspaperIsSubjectOfIterator)findAncestorWithClass(this, NewspaperIsSubjectOfIterator.class);
			pageContext.getOut().print(theNewspaperIsSubjectOfIterator.getIsSubjectOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for isSubjectOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for isSubjectOf tag ");
		}
		return SKIP_BODY;
	}
}

