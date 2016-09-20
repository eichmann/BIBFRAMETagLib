package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperHasFirst extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperHasFirst currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperHasFirst.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperHasFirstIterator theNewspaperHasFirstIterator = (NewspaperHasFirstIterator)findAncestorWithClass(this, NewspaperHasFirstIterator.class);
			pageContext.getOut().print(theNewspaperHasFirstIterator.getHasFirst());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for hasFirst tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for hasFirst tag ");
		}
		return SKIP_BODY;
	}
}

