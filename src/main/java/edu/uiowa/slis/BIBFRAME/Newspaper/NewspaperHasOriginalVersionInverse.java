package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperHasOriginalVersionInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperHasOriginalVersionInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperHasOriginalVersionInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperHasOriginalVersionInverseIterator theNewspaperHasOriginalVersionInverseIterator = (NewspaperHasOriginalVersionInverseIterator)findAncestorWithClass(this, NewspaperHasOriginalVersionInverseIterator.class);
			pageContext.getOut().print(theNewspaperHasOriginalVersionInverseIterator.getHasOriginalVersionInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for hasOriginalVersion tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for hasOriginalVersion tag ");
		}
		return SKIP_BODY;
	}
}

