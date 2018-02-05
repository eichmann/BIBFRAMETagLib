package edu.uiowa.slis.BIBFRAME.SymmetricProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SymmetricPropertyComment extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SymmetricPropertyComment currentInstance = null;
	private static final Log log = LogFactory.getLog(SymmetricPropertyComment.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SymmetricPropertyCommentIterator theSymmetricProperty = (SymmetricPropertyCommentIterator)findAncestorWithClass(this, SymmetricPropertyCommentIterator.class);
			pageContext.getOut().print(theSymmetricProperty.getComment());
		} catch (Exception e) {
			log.error("Can't find enclosing SymmetricProperty for comment tag ", e);
			throw new JspTagException("Error: Can't find enclosing SymmetricProperty for comment tag ");
		}
		return SKIP_BODY;
	}
}

