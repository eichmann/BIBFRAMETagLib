package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperPrecedes extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperPrecedes currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperPrecedes.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperPrecedesIterator theNewspaperPrecedesIterator = (NewspaperPrecedesIterator)findAncestorWithClass(this, NewspaperPrecedesIterator.class);
			pageContext.getOut().print(theNewspaperPrecedesIterator.getPrecedes());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for precedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for precedes tag ");
		}
		return SKIP_BODY;
	}
}

