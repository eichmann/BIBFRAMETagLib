package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperSubject extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperSubject currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperSubject.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperSubjectIterator theNewspaperSubjectIterator = (NewspaperSubjectIterator)findAncestorWithClass(this, NewspaperSubjectIterator.class);
			pageContext.getOut().print(theNewspaperSubjectIterator.getSubject());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for subject tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for subject tag ");
		}
		return SKIP_BODY;
	}
}

