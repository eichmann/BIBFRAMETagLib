package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperHasTitleType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperHasTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperHasTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperHasTitleIterator theNewspaperHasTitleIterator = (NewspaperHasTitleIterator)findAncestorWithClass(this, NewspaperHasTitleIterator.class);
			pageContext.getOut().print(theNewspaperHasTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

