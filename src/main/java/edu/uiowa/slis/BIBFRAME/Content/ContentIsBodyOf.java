package edu.uiowa.slis.BIBFRAME.Content;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContentIsBodyOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContentIsBodyOf currentInstance = null;
	private static final Log log = LogFactory.getLog(ContentIsBodyOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContentIsBodyOfIterator theContentIsBodyOfIterator = (ContentIsBodyOfIterator)findAncestorWithClass(this, ContentIsBodyOfIterator.class);
			pageContext.getOut().print(theContentIsBodyOfIterator.getIsBodyOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Content for isBodyOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Content for isBodyOf tag ");
		}
		return SKIP_BODY;
	}
}

