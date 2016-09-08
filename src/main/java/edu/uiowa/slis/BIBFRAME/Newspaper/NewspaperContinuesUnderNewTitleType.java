package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperContinuesUnderNewTitleType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperContinuesUnderNewTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperContinuesUnderNewTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperContinuesUnderNewTitleIterator theNewspaperContinuesUnderNewTitleIterator = (NewspaperContinuesUnderNewTitleIterator)findAncestorWithClass(this, NewspaperContinuesUnderNewTitleIterator.class);
			pageContext.getOut().print(theNewspaperContinuesUnderNewTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for continuesUnderNewTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for continuesUnderNewTitle tag ");
		}
		return SKIP_BODY;
	}
}

