package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperIsUnionOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperIsUnionOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperIsUnionOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperIsUnionOfIterator theNewspaperIsUnionOfIterator = (NewspaperIsUnionOfIterator)findAncestorWithClass(this, NewspaperIsUnionOfIterator.class);
			pageContext.getOut().print(theNewspaperIsUnionOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for isUnionOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for isUnionOf tag ");
		}
		return SKIP_BODY;
	}
}

