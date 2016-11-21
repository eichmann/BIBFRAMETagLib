package edu.uiowa.slis.BIBFRAME.Content;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContentIsBodyOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContentIsBodyOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ContentIsBodyOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContentIsBodyOfIterator theContentIsBodyOfIterator = (ContentIsBodyOfIterator)findAncestorWithClass(this, ContentIsBodyOfIterator.class);
			pageContext.getOut().print(theContentIsBodyOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Content for isBodyOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Content for isBodyOf tag ");
		}
		return SKIP_BODY;
	}
}

