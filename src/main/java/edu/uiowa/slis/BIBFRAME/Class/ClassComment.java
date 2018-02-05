package edu.uiowa.slis.BIBFRAME.Class;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClassComment extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ClassComment currentInstance = null;
	private static final Log log = LogFactory.getLog(ClassComment.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ClassCommentIterator theClass = (ClassCommentIterator)findAncestorWithClass(this, ClassCommentIterator.class);
			pageContext.getOut().print(theClass.getComment());
		} catch (Exception e) {
			log.error("Can't find enclosing Class for comment tag ", e);
			throw new JspTagException("Error: Can't find enclosing Class for comment tag ");
		}
		return SKIP_BODY;
	}
}

