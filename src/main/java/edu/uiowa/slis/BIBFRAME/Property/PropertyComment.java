package edu.uiowa.slis.BIBFRAME.Property;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PropertyComment extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PropertyComment currentInstance = null;
	private static final Log log = LogFactory.getLog(PropertyComment.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PropertyCommentIterator theProperty = (PropertyCommentIterator)findAncestorWithClass(this, PropertyCommentIterator.class);
			pageContext.getOut().print(theProperty.getComment());
		} catch (Exception e) {
			log.error("Can't find enclosing Property for comment tag ", e);
			throw new JspTagException("Error: Can't find enclosing Property for comment tag ");
		}
		return SKIP_BODY;
	}
}

