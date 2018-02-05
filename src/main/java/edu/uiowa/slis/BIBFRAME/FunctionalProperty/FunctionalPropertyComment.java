package edu.uiowa.slis.BIBFRAME.FunctionalProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FunctionalPropertyComment extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FunctionalPropertyComment currentInstance = null;
	private static final Log log = LogFactory.getLog(FunctionalPropertyComment.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FunctionalPropertyCommentIterator theFunctionalProperty = (FunctionalPropertyCommentIterator)findAncestorWithClass(this, FunctionalPropertyCommentIterator.class);
			pageContext.getOut().print(theFunctionalProperty.getComment());
		} catch (Exception e) {
			log.error("Can't find enclosing FunctionalProperty for comment tag ", e);
			throw new JspTagException("Error: Can't find enclosing FunctionalProperty for comment tag ");
		}
		return SKIP_BODY;
	}
}

