package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperIsLastOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperIsLastOf currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperIsLastOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperIsLastOfIterator theNewspaperIsLastOfIterator = (NewspaperIsLastOfIterator)findAncestorWithClass(this, NewspaperIsLastOfIterator.class);
			pageContext.getOut().print(theNewspaperIsLastOfIterator.getIsLastOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for isLastOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for isLastOf tag ");
		}
		return SKIP_BODY;
	}
}

