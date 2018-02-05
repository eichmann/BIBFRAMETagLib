package edu.uiowa.slis.BIBFRAME.InverseFunctionalProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InverseFunctionalPropertyComment extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static InverseFunctionalPropertyComment currentInstance = null;
	private static final Log log = LogFactory.getLog(InverseFunctionalPropertyComment.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			InverseFunctionalPropertyCommentIterator theInverseFunctionalProperty = (InverseFunctionalPropertyCommentIterator)findAncestorWithClass(this, InverseFunctionalPropertyCommentIterator.class);
			pageContext.getOut().print(theInverseFunctionalProperty.getComment());
		} catch (Exception e) {
			log.error("Can't find enclosing InverseFunctionalProperty for comment tag ", e);
			throw new JspTagException("Error: Can't find enclosing InverseFunctionalProperty for comment tag ");
		}
		return SKIP_BODY;
	}
}

