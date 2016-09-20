package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperHasTitle extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperHasTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperHasTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperHasTitleIterator theNewspaperHasTitleIterator = (NewspaperHasTitleIterator)findAncestorWithClass(this, NewspaperHasTitleIterator.class);
			pageContext.getOut().print(theNewspaperHasTitleIterator.getHasTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

