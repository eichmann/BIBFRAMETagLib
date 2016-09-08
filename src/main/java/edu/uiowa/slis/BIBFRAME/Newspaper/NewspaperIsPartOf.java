package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperIsPartOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperIsPartOf currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperIsPartOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperIsPartOfIterator theNewspaperIsPartOfIterator = (NewspaperIsPartOfIterator)findAncestorWithClass(this, NewspaperIsPartOfIterator.class);
			pageContext.getOut().print(theNewspaperIsPartOfIterator.getIsPartOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for isPartOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for isPartOf tag ");
		}
		return SKIP_BODY;
	}
}

