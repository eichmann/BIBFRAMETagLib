package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperContinuedUnderNewTitleBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperContinuedUnderNewTitleBy currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperContinuedUnderNewTitleBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperContinuedUnderNewTitleByIterator theNewspaperContinuedUnderNewTitleByIterator = (NewspaperContinuedUnderNewTitleByIterator)findAncestorWithClass(this, NewspaperContinuedUnderNewTitleByIterator.class);
			pageContext.getOut().print(theNewspaperContinuedUnderNewTitleByIterator.getContinuedUnderNewTitleBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for continuedUnderNewTitleBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for continuedUnderNewTitleBy tag ");
		}
		return SKIP_BODY;
	}
}

