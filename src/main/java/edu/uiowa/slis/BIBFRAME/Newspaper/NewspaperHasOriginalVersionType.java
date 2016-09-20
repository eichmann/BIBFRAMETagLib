package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperHasOriginalVersionType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperHasOriginalVersionType currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperHasOriginalVersionType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperHasOriginalVersionIterator theNewspaperHasOriginalVersionIterator = (NewspaperHasOriginalVersionIterator)findAncestorWithClass(this, NewspaperHasOriginalVersionIterator.class);
			pageContext.getOut().print(theNewspaperHasOriginalVersionIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for hasOriginalVersion tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for hasOriginalVersion tag ");
		}
		return SKIP_BODY;
	}
}

