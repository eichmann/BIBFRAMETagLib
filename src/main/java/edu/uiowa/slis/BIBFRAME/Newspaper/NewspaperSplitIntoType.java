package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperSplitIntoType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperSplitIntoType currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperSplitIntoType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperSplitIntoIterator theNewspaperSplitIntoIterator = (NewspaperSplitIntoIterator)findAncestorWithClass(this, NewspaperSplitIntoIterator.class);
			pageContext.getOut().print(theNewspaperSplitIntoIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for splitInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for splitInto tag ");
		}
		return SKIP_BODY;
	}
}

