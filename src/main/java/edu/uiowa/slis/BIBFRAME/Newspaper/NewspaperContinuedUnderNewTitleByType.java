package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperContinuedUnderNewTitleByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperContinuedUnderNewTitleByType currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperContinuedUnderNewTitleByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperContinuedUnderNewTitleByIterator theNewspaperContinuedUnderNewTitleByIterator = (NewspaperContinuedUnderNewTitleByIterator)findAncestorWithClass(this, NewspaperContinuedUnderNewTitleByIterator.class);
			pageContext.getOut().print(theNewspaperContinuedUnderNewTitleByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for continuedUnderNewTitleBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for continuedUnderNewTitleBy tag ");
		}
		return SKIP_BODY;
	}
}

