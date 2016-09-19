package edu.uiowa.slis.BIBFRAME.ContentAsText;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContentAsTextIsBodyOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContentAsTextIsBodyOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ContentAsTextIsBodyOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContentAsTextIsBodyOfIterator theContentAsTextIsBodyOfIterator = (ContentAsTextIsBodyOfIterator)findAncestorWithClass(this, ContentAsTextIsBodyOfIterator.class);
			pageContext.getOut().print(theContentAsTextIsBodyOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ContentAsText for isBodyOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContentAsText for isBodyOf tag ");
		}
		return SKIP_BODY;
	}
}

