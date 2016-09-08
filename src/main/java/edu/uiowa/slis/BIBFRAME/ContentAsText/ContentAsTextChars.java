package edu.uiowa.slis.BIBFRAME.ContentAsText;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContentAsTextChars extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContentAsTextChars currentInstance = null;
	private static final Log log = LogFactory.getLog(ContentAsTextChars.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContentAsTextCharsIterator theContentAsText = (ContentAsTextCharsIterator)findAncestorWithClass(this, ContentAsTextCharsIterator.class);
			pageContext.getOut().print(theContentAsText.getChars());
		} catch (Exception e) {
			log.error("Can't find enclosing ContentAsText for chars tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContentAsText for chars tag ");
		}
		return SKIP_BODY;
	}
}

