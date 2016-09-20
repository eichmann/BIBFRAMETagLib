package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperHasOriginalVersion extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperHasOriginalVersion currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperHasOriginalVersion.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperHasOriginalVersionIterator theNewspaperHasOriginalVersionIterator = (NewspaperHasOriginalVersionIterator)findAncestorWithClass(this, NewspaperHasOriginalVersionIterator.class);
			pageContext.getOut().print(theNewspaperHasOriginalVersionIterator.getHasOriginalVersion());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for hasOriginalVersion tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for hasOriginalVersion tag ");
		}
		return SKIP_BODY;
	}
}

