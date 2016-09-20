package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperPrecedesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperPrecedesType currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperPrecedesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperPrecedesIterator theNewspaperPrecedesIterator = (NewspaperPrecedesIterator)findAncestorWithClass(this, NewspaperPrecedesIterator.class);
			pageContext.getOut().print(theNewspaperPrecedesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for precedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for precedes tag ");
		}
		return SKIP_BODY;
	}
}

